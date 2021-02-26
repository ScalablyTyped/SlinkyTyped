package typingsSlinky.contentfulManagement

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.commonTypesMod.DefaultElements
import typingsSlinky.contentfulManagement.commonTypesMod.MetaLinkProps
import typingsSlinky.contentfulManagement.commonTypesMod.MetaSysProps
import typingsSlinky.contentfulManagement.commonTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamSpaceMembershipMod {
  
  @JSImport("contentful-management/dist/typings/entities/team-space-membership", "wrapTeamSpaceMembership")
  @js.native
  def wrapTeamSpaceMembership(http: AxiosInstance, data: TeamSpaceMembershipProps): TeamSpaceMembership = js.native
  
  @JSImport("contentful-management/dist/typings/entities/team-space-membership", "wrapTeamSpaceMembershipCollection")
  @js.native
  def wrapTeamSpaceMembershipCollection(http: AxiosInstance, data: CollectionProp[TeamSpaceMembershipProps]): Collection[TeamSpaceMembership, TeamSpaceMembershipProps] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var query: js.UndefOr[QueryOptions] = js.native
    
    var teamId: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: QueryOptions): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    }
  }
  
  @js.native
  trait TeamSpaceMembership
    extends TeamSpaceMembershipProps
       with DefaultElements[TeamSpaceMembershipProps] {
    
    /**
      * Deletes this object on the server.
      * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getTeamSpaceMembership('<team_space_membership_id>'))
      * .then((teamSpaceMembership) => teamSpaceMembership.delete())
      * .then(() => console.log(`spaceMembership deleted.`))
      * .catch(console.error)
      * ```
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Sends an update to the server with any changes made to the object's properties
      * @return Object returned from the server with updated changes.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      *  .then((space) => space.getTeamSpaceMembership('team_space_membership_id'))
      *  .then((teamSpaceMembership) => {
      *    item.roles = [
      *      {
      *        sys: {
      *          type: 'Link',
      *          linkType: 'Role',
      *          id: 'role_id'
      *        }
      *      }
      *    ]
      *  })
      *  .then((spaceMembership) => console.log(`spaceMembership ${spaceMembership.sys.id} updated.`))
      *  .catch(console.error)
      *  ```
      */
    def update(): js.Promise[TeamSpaceMembership] = js.native
  }
  object TeamSpaceMembership {
    
    @scala.inline
    def apply(
      admin: Boolean,
      delete: () => js.Promise[Unit],
      roles: js.Array[MetaLinkProps],
      sys: MetaSysProps,
      toPlainObject: () => TeamSpaceMembershipProps,
      update: () => js.Promise[TeamSpaceMembership]
    ): TeamSpaceMembership = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[TeamSpaceMembership]
    }
    
    @scala.inline
    implicit class TeamSpaceMembershipMutableBuilder[Self <: TeamSpaceMembership] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[TeamSpaceMembership]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TeamSpaceMembershipProps extends StObject {
    
    /**
      * Is admin
      */
    var admin: Boolean = js.native
    
    /**
      * Roles
      */
    var roles: js.Array[MetaLinkProps] = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysProps = js.native
  }
  object TeamSpaceMembershipProps {
    
    @scala.inline
    def apply(admin: Boolean, roles: js.Array[MetaLinkProps], sys: MetaSysProps): TeamSpaceMembershipProps = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamSpaceMembershipProps]
    }
    
    @scala.inline
    implicit class TeamSpaceMembershipPropsMutableBuilder[Self <: TeamSpaceMembershipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
