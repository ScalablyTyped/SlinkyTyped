package typingsSlinky.maximMazurokGapiClientFirebasedatabase

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.anon.Alt
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.anon.Callback
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.anon.Fields
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.anon.Key
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object firebasedatabase {
      
      @js.native
      trait DatabaseInstance extends StObject {
        
        /** Immutable. The globally unique hostname of the database. */
        var databaseUrl: js.UndefOr[String] = js.native
        
        /**
          * The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`. Currently the only supported
          * location is 'us-central1'.
          */
        var name: js.UndefOr[String] = js.native
        
        /** The resource name of the project this instance belongs to. For example: `projects/{project-number}`. */
        var project: js.UndefOr[String] = js.native
        
        /** The database's lifecycle state. Read-only. */
        var state: js.UndefOr[String] = js.native
        
        /** The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted. */
        var `type`: js.UndefOr[String] = js.native
      }
      object DatabaseInstance {
        
        @scala.inline
        def apply(): DatabaseInstance = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DatabaseInstance]
        }
        
        @scala.inline
        implicit class DatabaseInstanceMutableBuilder[Self <: DatabaseInstance] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDatabaseUrl(value: String): Self = StObject.set(x, "databaseUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDatabaseUrlUndefined: Self = StObject.set(x, "databaseUrl", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
          
          @scala.inline
          def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait DisableDatabaseInstanceRequest extends StObject
      
      @js.native
      trait InstancesResource extends StObject {
        
        /**
          * Requests that a new DatabaseInstance be created. The state of a successfully created DatabaseInstance is ACTIVE. Only available for projects on the Blaze plan. Projects can be
          * upgraded using the Cloud Billing API https://cloud.google.com/billing/reference/rest/v1/projects/updateBillingInfo. Note that it might take a few minutes for billing enablement
          * state to propagate to Firebase systems.
          */
        def create(request: Accesstoken): Request[DatabaseInstance] = js.native
        def create(request: Alt, body: DatabaseInstance): Request[DatabaseInstance] = js.native
        
        /**
          * Marks a DatabaseInstance to be deleted. The DatabaseInstance will be purged within 30 days. The default database cannot be deleted. IDs for deleted database instances may never be
          * recovered or re-used. The Database may only be deleted if it is already in a DISABLED state.
          */
        def delete(): Request[DatabaseInstance] = js.native
        def delete(request: Callback): Request[DatabaseInstance] = js.native
        
        def disable(request: Callback, body: DisableDatabaseInstanceRequest): Request[DatabaseInstance] = js.native
        /**
          * Disables a DatabaseInstance. The database can be re-enabled later using ReenableDatabaseInstance. When a database is disabled, all reads and writes are denied, including view access
          * in the Firebase console.
          */
        def disable(request: Fields): Request[DatabaseInstance] = js.native
        
        /** Gets the DatabaseInstance identified by the specified resource name. */
        def get(): Request[DatabaseInstance] = js.native
        def get(request: Callback): Request[DatabaseInstance] = js.native
        
        /**
          * Lists each DatabaseInstance associated with the specified parent project. The list items are returned in no particular order, but will be a consistent view of the database instances
          * when additional requests are made with a `pageToken`. The resulting list contains instances in any STATE. The list results may be stale by a few seconds. Use GetDatabaseInstance for
          * consistent reads.
          */
        def list(): Request[ListDatabaseInstancesResponse] = js.native
        def list(request: Key): Request[ListDatabaseInstancesResponse] = js.native
        
        def reenable(request: Callback, body: ReenableDatabaseInstanceRequest): Request[DatabaseInstance] = js.native
        /** Enables a DatabaseInstance. The database must have been disabled previously using DisableDatabaseInstance. The state of a successfully reenabled DatabaseInstance is ACTIVE. */
        def reenable(request: Name): Request[DatabaseInstance] = js.native
      }
      
      @js.native
      trait ListDatabaseInstancesResponse extends StObject {
        
        /** List of each DatabaseInstance that is in the parent Firebase project. */
        var instances: js.UndefOr[js.Array[DatabaseInstance]] = js.native
        
        /**
          * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used
          * in a subsequent call to `ListDatabaseInstances` to find the next group of database instances. Page tokens are short-lived and should not be persisted.
          */
        var nextPageToken: js.UndefOr[String] = js.native
      }
      object ListDatabaseInstancesResponse {
        
        @scala.inline
        def apply(): ListDatabaseInstancesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListDatabaseInstancesResponse]
        }
        
        @scala.inline
        implicit class ListDatabaseInstancesResponseMutableBuilder[Self <: ListDatabaseInstancesResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInstances(value: js.Array[DatabaseInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
          
          @scala.inline
          def setInstancesVarargs(value: DatabaseInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait LocationsResource extends StObject {
        
        var instances: InstancesResource = js.native
      }
      object LocationsResource {
        
        @scala.inline
        def apply(instances: InstancesResource): LocationsResource = {
          val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
          __obj.asInstanceOf[LocationsResource]
        }
        
        @scala.inline
        implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInstances(value: InstancesResource): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ProjectsResource extends StObject {
        
        var locations: LocationsResource = js.native
      }
      object ProjectsResource {
        
        @scala.inline
        def apply(locations: LocationsResource): ProjectsResource = {
          val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProjectsResource]
        }
        
        @scala.inline
        implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait ReenableDatabaseInstanceRequest extends StObject
    }
  }
}
