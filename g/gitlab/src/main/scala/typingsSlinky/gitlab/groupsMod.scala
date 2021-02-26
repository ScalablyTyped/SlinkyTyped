package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.Sudoproviderstringundefin
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.projectsMod.ProjectSchema
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupsMod {
  
  @JSImport("gitlab/dist/types/core/services/Groups", "Groups")
  @js.native
  class Groups () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[js.Array[GroupSchema]] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[js.Array[GroupSchema]] = js.native
    
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def createLDAPLink(groupId: String, cn: js.Any, groupAccess: js.Any, provider: String): js.Promise[js.Object] = js.native
    def createLDAPLink(groupId: String, cn: js.Any, groupAccess: js.Any, provider: String, options: Sudo): js.Promise[js.Object] = js.native
    def createLDAPLink(groupId: Double, cn: js.Any, groupAccess: js.Any, provider: String): js.Promise[js.Object] = js.native
    def createLDAPLink(groupId: Double, cn: js.Any, groupAccess: js.Any, provider: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def edit(groupId: String): js.Promise[js.Object] = js.native
    def edit(groupId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(groupId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def projects(groupId: String): js.Promise[js.Array[ProjectSchema]] = js.native
    def projects(groupId: String, options: BaseRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
    def projects(groupId: Double): js.Promise[js.Array[ProjectSchema]] = js.native
    def projects(groupId: Double, options: BaseRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
    
    def remove(groupId: String): js.Promise[js.Object] = js.native
    def remove(groupId: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(groupId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def removeLDAPLink(groupId: String, cn: js.Any): js.Promise[js.Object] = js.native
    def removeLDAPLink(groupId: String, cn: js.Any, hasProviderOptions: Sudoproviderstringundefin): js.Promise[js.Object] = js.native
    def removeLDAPLink(groupId: Double, cn: js.Any): js.Promise[js.Object] = js.native
    def removeLDAPLink(groupId: Double, cn: js.Any, hasProviderOptions: Sudoproviderstringundefin): js.Promise[js.Object] = js.native
    
    def search(nameOrPath: String): js.Promise[GetResponse] = js.native
    def search(nameOrPath: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def show(groupId: String): js.Promise[GroupDetailSchema] = js.native
    def show(groupId: String, options: BaseRequestOptions): js.Promise[GroupDetailSchema] = js.native
    def show(groupId: Double): js.Promise[GroupDetailSchema] = js.native
    def show(groupId: Double, options: BaseRequestOptions): js.Promise[GroupDetailSchema] = js.native
    
    def subgroups(groupId: String): js.Promise[js.Array[GroupDetailSchema]] = js.native
    def subgroups(groupId: String, options: PaginatedRequestOptions): js.Promise[js.Array[GroupDetailSchema]] = js.native
    def subgroups(groupId: Double): js.Promise[js.Array[GroupDetailSchema]] = js.native
    def subgroups(groupId: Double, options: PaginatedRequestOptions): js.Promise[js.Array[GroupDetailSchema]] = js.native
    
    def syncLDAP(groupId: String): js.Promise[js.Object] = js.native
    def syncLDAP(groupId: String, options: Sudo): js.Promise[js.Object] = js.native
    def syncLDAP(groupId: Double): js.Promise[js.Object] = js.native
    def syncLDAP(groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  trait GroupDetailSchema extends GroupSchema {
    
    var projects: js.Array[ProjectSchema] = js.native
    
    var runners_token: String = js.native
    
    var shared_projects: js.Array[ProjectSchema] = js.native
  }
  object GroupDetailSchema {
    
    @scala.inline
    def apply(
      avatar_url: String,
      description: String,
      full_name: String,
      full_path: String,
      id: Double,
      lfs_enabled: Boolean,
      name: String,
      path: String,
      project_creation_level: String,
      projects: js.Array[ProjectSchema],
      request_access_enabled: Boolean,
      require_two_factor_authentication: Boolean,
      runners_token: String,
      share_with_group_lock: Boolean,
      shared_projects: js.Array[ProjectSchema],
      subgroup_creation_level: String,
      two_factor_grace_period: Double,
      visibility: String,
      web_url: String
    ): GroupDetailSchema = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project_creation_level = project_creation_level.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], require_two_factor_authentication = require_two_factor_authentication.asInstanceOf[js.Any], runners_token = runners_token.asInstanceOf[js.Any], share_with_group_lock = share_with_group_lock.asInstanceOf[js.Any], shared_projects = shared_projects.asInstanceOf[js.Any], subgroup_creation_level = subgroup_creation_level.asInstanceOf[js.Any], two_factor_grace_period = two_factor_grace_period.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupDetailSchema]
    }
    
    @scala.inline
    implicit class GroupDetailSchemaMutableBuilder[Self <: GroupDetailSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjects(value: js.Array[ProjectSchema]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectsVarargs(value: ProjectSchema*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      @scala.inline
      def setRunners_token(value: String): Self = StObject.set(x, "runners_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShared_projects(value: js.Array[ProjectSchema]): Self = StObject.set(x, "shared_projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShared_projectsVarargs(value: ProjectSchema*): Self = StObject.set(x, "shared_projects", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GroupSchema extends StObject {
    
    var auto_devops_enabled: js.UndefOr[Boolean] = js.native
    
    var avatar_url: String = js.native
    
    var description: String = js.native
    
    var emails_disabled: js.UndefOr[Boolean] = js.native
    
    var full_name: String = js.native
    
    var full_path: String = js.native
    
    var id: Double = js.native
    
    var lfs_enabled: Boolean = js.native
    
    var name: String = js.native
    
    var parent_id: js.UndefOr[Double] = js.native
    
    var path: String = js.native
    
    var project_creation_level: String = js.native
    
    var request_access_enabled: Boolean = js.native
    
    var require_two_factor_authentication: Boolean = js.native
    
    var share_with_group_lock: Boolean = js.native
    
    var subgroup_creation_level: String = js.native
    
    var two_factor_grace_period: Double = js.native
    
    var visibility: String = js.native
    
    var web_url: String = js.native
  }
  object GroupSchema {
    
    @scala.inline
    def apply(
      avatar_url: String,
      description: String,
      full_name: String,
      full_path: String,
      id: Double,
      lfs_enabled: Boolean,
      name: String,
      path: String,
      project_creation_level: String,
      request_access_enabled: Boolean,
      require_two_factor_authentication: Boolean,
      share_with_group_lock: Boolean,
      subgroup_creation_level: String,
      two_factor_grace_period: Double,
      visibility: String,
      web_url: String
    ): GroupSchema = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project_creation_level = project_creation_level.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], require_two_factor_authentication = require_two_factor_authentication.asInstanceOf[js.Any], share_with_group_lock = share_with_group_lock.asInstanceOf[js.Any], subgroup_creation_level = subgroup_creation_level.asInstanceOf[js.Any], two_factor_grace_period = two_factor_grace_period.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupSchema]
    }
    
    @scala.inline
    implicit class GroupSchemaMutableBuilder[Self <: GroupSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_devops_enabled(value: Boolean): Self = StObject.set(x, "auto_devops_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_devops_enabledUndefined: Self = StObject.set(x, "auto_devops_enabled", js.undefined)
      
      @scala.inline
      def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmails_disabled(value: Boolean): Self = StObject.set(x, "emails_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmails_disabledUndefined: Self = StObject.set(x, "emails_disabled", js.undefined)
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_path(value: String): Self = StObject.set(x, "full_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLfs_enabled(value: Boolean): Self = StObject.set(x, "lfs_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_id(value: Double): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject_creation_level(value: String): Self = StObject.set(x, "project_creation_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_access_enabled(value: Boolean): Self = StObject.set(x, "request_access_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequire_two_factor_authentication(value: Boolean): Self = StObject.set(x, "require_two_factor_authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShare_with_group_lock(value: Boolean): Self = StObject.set(x, "share_with_group_lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubgroup_creation_level(value: String): Self = StObject.set(x, "subgroup_creation_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwo_factor_grace_period(value: Double): Self = StObject.set(x, "two_factor_grace_period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
    }
  }
}
