package typingsSlinky.maximMazurokGapiClientCloudprofiler

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudprofiler.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientCloudprofiler.anon.Alt
import typingsSlinky.maximMazurokGapiClientCloudprofiler.anon.Callback
import typingsSlinky.maximMazurokGapiClientCloudprofiler.anon.Fields
import typingsSlinky.maximMazurokGapiClientCloudprofiler.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object cloudprofiler {
      
      @js.native
      trait CreateProfileRequest extends StObject {
        
        /** Deployment details. */
        var deployment: js.UndefOr[Deployment] = js.native
        
        /** One or more profile types that the agent is capable of providing. */
        var profileType: js.UndefOr[js.Array[String]] = js.native
      }
      object CreateProfileRequest {
        
        @scala.inline
        def apply(): CreateProfileRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CreateProfileRequest]
        }
        
        @scala.inline
        implicit class CreateProfileRequestMutableBuilder[Self <: CreateProfileRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
          
          @scala.inline
          def setProfileType(value: js.Array[String]): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
          
          @scala.inline
          def setProfileTypeVarargs(value: String*): Self = StObject.set(x, "profileType", js.Array(value :_*))
        }
      }
      
      @js.native
      trait Deployment extends StObject {
        
        /**
          * Labels identify the deployment within the user universe and same target. Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`. Value for an individual label must
          * be <= 512 bytes, the total size of all label names and values must be <= 1024 bytes. Label named "language" can be used to record the programming language of the profiled
          * deployment. The standard choices for the value include "java", "go", "python", "ruby", "nodejs", "php", "dotnet". For deployments running on Google Cloud Platform, "zone" or
          * "region" label should be present describing the deployment location. An example of a zone is "us-central1-a", an example of a region is "us-central1" or "us-central".
          */
        var labels: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: string}
          */ typingsSlinky.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.Deployment with TopLevel[js.Any]
              ] = js.native
        
        /** Project ID is the ID of a cloud project. Validation regex: `^a-z{4,61}[a-z0-9]$`. */
        var projectId: js.UndefOr[String] = js.native
        
        /**
          * Target is the service name used to group related deployments: * Service name for GAE Flex / Standard. * Cluster and container name for GKE. * User-specified string for direct GCE
          * profiling (e.g. Java). * Job name for Dataflow. Validation regex: `^[a-z]([-a-z0-9_.]{0,253}[a-z0-9])?$`.
          */
        var target: js.UndefOr[String] = js.native
      }
      object Deployment {
        
        @scala.inline
        def apply(): Deployment = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Deployment]
        }
        
        @scala.inline
        implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLabels(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: string}
            */ typingsSlinky.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.Deployment with TopLevel[js.Any]
          ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
          
          @scala.inline
          def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
          
          @scala.inline
          def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        }
      }
      
      @js.native
      trait Profile extends StObject {
        
        /** Deployment this profile corresponds to. */
        var deployment: js.UndefOr[Deployment] = js.native
        
        /**
          * Duration of the profiling session. Input (for the offline mode) or output (for the online mode). The field represents requested profiling duration. It may slightly differ from the
          * effective profiling duration, which is recorded in the profile data, in case the profiling can't be stopped immediately (e.g. in case stopping the profiling is handled
          * asynchronously).
          */
        var duration: js.UndefOr[String] = js.native
        
        /**
          * Input only. Labels associated to this specific profile. These labels will get merged with the deployment labels for the final data set. See documentation on deployment labels for
          * validation rules and limits.
          */
        var labels: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: string}
          */ typingsSlinky.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.Profile with TopLevel[js.Any]
              ] = js.native
        
        /** Output only. Opaque, server-assigned, unique ID for this profile. */
        var name: js.UndefOr[String] = js.native
        
        /** Input only. Profile bytes, as a gzip compressed serialized proto, the format is https://github.com/google/pprof/blob/master/proto/profile.proto. */
        var profileBytes: js.UndefOr[String] = js.native
        
        /** Type of profile. For offline mode, this must be specified when creating the profile. For online mode it is assigned and returned by the server. */
        var profileType: js.UndefOr[String] = js.native
      }
      object Profile {
        
        @scala.inline
        def apply(): Profile = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Profile]
        }
        
        @scala.inline
        implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
          
          @scala.inline
          def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
          
          @scala.inline
          def setLabels(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: string}
            */ typingsSlinky.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.Profile with TopLevel[js.Any]
          ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setProfileBytes(value: String): Self = StObject.set(x, "profileBytes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProfileBytesUndefined: Self = StObject.set(x, "profileBytes", js.undefined)
          
          @scala.inline
          def setProfileType(value: String): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
        }
      }
      
      @js.native
      trait ProfilesResource extends StObject {
        
        /**
          * CreateProfile creates a new profile resource in the online mode. The server ensures that the new profiles are created at a constant rate per deployment, so the creation request may
          * hang for some time until the next profile session is available. The request may fail with ABORTED error if the creation is not available within ~1m, the response will indicate the
          * duration of the backoff the client should take before attempting creating a profile again. The backoff duration is returned in google.rpc.RetryInfo extension on the response status.
          * To a gRPC client, the extension will be return as a binary-serialized proto in the trailing metadata item named "google.rpc.retryinfo-bin".
          */
        def create(request: Accesstoken): Request[Profile] = js.native
        def create(request: Alt, body: CreateProfileRequest): Request[Profile] = js.native
        
        def createOffline(request: Alt, body: Profile): Request[Profile] = js.native
        /** CreateOfflineProfile creates a new profile resource in the offline mode. The client provides the profile to create along with the profile bytes, the server records it. */
        def createOffline(request: Callback): Request[Profile] = js.native
        
        /**
          * UpdateProfile updates the profile bytes and labels on the profile resource created in the online mode. Updating the bytes for profiles created in the offline mode is currently not
          * supported: the profile content must be provided at the time of the profile creation.
          */
        def patch(request: Fields): Request[Profile] = js.native
        def patch(request: Key, body: Profile): Request[Profile] = js.native
      }
      
      @js.native
      trait ProjectsResource extends StObject {
        
        var profiles: ProfilesResource = js.native
      }
      object ProjectsResource {
        
        @scala.inline
        def apply(profiles: ProfilesResource): ProjectsResource = {
          val __obj = js.Dynamic.literal(profiles = profiles.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProjectsResource]
        }
        
        @scala.inline
        implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setProfiles(value: ProfilesResource): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
