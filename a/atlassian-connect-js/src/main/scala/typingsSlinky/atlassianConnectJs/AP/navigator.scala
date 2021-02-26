package typingsSlinky.atlassianConnectJs.AP

import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.`version-at-save`
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.blogpost
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.current
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Navigator API allows your add-on to change the current page using JavaScript.
  */
object navigator {
  
  @js.native
  sealed trait NavigatorTargetConfluence extends StObject
  @JSGlobal("AP.navigator.NavigatorTargetConfluence")
  @js.native
  object NavigatorTargetConfluence extends StObject {
    
    /**
      * The module page within a specific add-on. Takes an `addonKey` and a `moduleKey` to identify the correct module.
      */
    @js.native
    sealed trait addonModule extends NavigatorTargetConfluence
    
    /**
      * The edit page for pages, blogs and custom content. Takes a `contentId` to identify the content.
      */
    @js.native
    sealed trait contentedit extends NavigatorTargetConfluence
    
    /**
      * The list/collector page for pages, blogs and custom content contained in a space. Takes a `spaceKey` and a `contentType` to identify the content type.
      */
    @js.native
    sealed trait contentlist extends NavigatorTargetConfluence
    
    /**
      * The view page for pages, blogs and custom content. Takes a `contentId` to identify the content.
      */
    @js.native
    sealed trait contentview extends NavigatorTargetConfluence
    
    /**
      * The dashboard of Confluence.
      */
    @js.native
    sealed trait dashboard extends NavigatorTargetConfluence
    
    /**
      * A specific location contained within a site. Takes a `relativeUrl` to identify the path.
      */
    @js.native
    sealed trait site extends NavigatorTargetConfluence
    
    /**
      * The space tools page. Takes a `spaceKey` to identify the space.
      */
    @js.native
    sealed trait spacetools extends NavigatorTargetConfluence
    
    /**
      * The space view page. Takes a `spaceKey` to identify the space.
      */
    @js.native
    sealed trait spaceview extends NavigatorTargetConfluence
    
    /**
      * The profile page for a specific user. Takes a `username` or `userAccountId` to identify the user.
      */
    @js.native
    sealed trait userProfile extends NavigatorTargetConfluence
  }
  
  @js.native
  sealed trait NavigatorTargetJira extends StObject
  @JSGlobal("AP.navigator.NavigatorTargetJira")
  @js.native
  object NavigatorTargetJira extends StObject {
    
    /**
      * The module page within a specific add-on. Takes an `addonKey` and a `moduleKey` to identify the correct module.
      */
    @js.native
    sealed trait addonModule extends NavigatorTargetJira
    
    /**
      * A specific dashboard in Jira. Takes a `dashboardId` to identify the dashboard.
      */
    @js.native
    sealed trait dashboard extends NavigatorTargetJira
    
    /**
      * A specific Issue in Jira. Takes an `issueKey` to identify the issue.
      */
    @js.native
    sealed trait issue extends NavigatorTargetJira
    
    /**
      * The admin details of a specific Jira Project. Takes a `projectKey` to identify the project. Only accessible to administrators.
      */
    @js.native
    sealed trait projectAdminSummary extends NavigatorTargetJira
    
    /**
      * The admin panel definted by a connect addon. Takes an `addonKey`, `adminPageKey`, `projectKey` and `projectId`. Only accessible to administrators.
      */
    @js.native
    sealed trait projectAdminTabPanel extends NavigatorTargetJira
    
    /**
      * A specific location contained within the site. Takes either a `relativeUrl` or `absoluteUrl` to identify the path.
      */
    @js.native
    sealed trait site extends NavigatorTargetJira
    
    /**
      * The profile page for a Jira User. Takes a `username` or `userAccountId` to identify the user.
      */
    @js.native
    sealed trait userProfile extends NavigatorTargetJira
  }
  
  @js.native
  trait NavigatorContext extends StObject {
    
    /**
      * Identifies a specific page within a site. Required for the `site` target and must be within the site's domain.
      */
    var absoluteUrl: String = js.native
    
    /**
      * Identifies a connect add-on. Required for the `addonModule` and `projectAdminTabPanel` targets.
      */
    var addonKey: String = js.native
    
    /**
      * Identifies a Jira Project Admin Tab Panels module key. Required for the `projectAdminTabPanel` target.
      */
    var adminPageKey: String = js.native
    
    /**
      * Identifies a piece of content. Required for the `contentView` target.
      */
    var contentId: String = js.native
    
    /**
      * Identifies the type of content. Can be either `page` or `blogpost`. Required for the `contentEdit` target.
      */
    var contentType: page | blogpost = js.native
    
    /**
      * Contains parameters that will be added as query parameters to the product url with "ac." prepended.
      * Used only in `addonModule` target. See Add-on specific context parameters for more info.
      */
    var customData: String = js.native
    
    /**
      * Identifies a Jira dashboard. Required for the `dashboard` target in Jira.
      */
    var dashboardId: String = js.native
    
    /**
      * Identifies the mode for rendering embedded content in Confluence, such as attachments embedded in a page. This only applies to the `contentView` target.
      * Valid values are:
      * - `current` (render the embedded content using the latest version)
      * - `version-at-save` (render the embedded content using the version at the time the content was saved)
      *
      * This parameter is optional and defaults to `current`.
      */
    var embeddedContentRender: js.UndefOr[current | `version-at-save`] = js.native
    
    /**
      * Identifies a Jira issue. Required for the `issue` target.
      */
    var issueKey: String = js.native
    
    /**
      * Identifies a connect add-on module. Required for the `addonModule` target.
      */
    var moduleKey: String = js.native
    
    /**
      * Identifies a Jira Project by its ID number. Required for the `projectAdminTabPanel` target.
      */
    var projectId: String = js.native
    
    /**
      * Identifies a Jira project. Required for the `projectSummary`, `projectAdminSummary` and `projectAdminTabPanel` targets.
      */
    var projectKey: String = js.native
    
    /**
      * Identifies a specific page within a site. Required for the `site` target and must begin with `/`.
      */
    var relativeUrl: String = js.native
    
    /**
      * Identifies a space. Required for the `spaceView` and `spaceTools` targets.
      */
    var spaceKey: String = js.native
    
    /**
      * Identifies a user. One of this or `username` required for the `userProfile` target.
      */
    var userAccountId: String = js.native
    
    /**
      * Identifies a user. One of this or `userAccountId` required for the `userProfile` target.
      */
    var username: String = js.native
    
    /**
      * Identifies a version of a piece of content in Confluence. This parameter is optional, and only applies to the `contentView` target, allowing navigation to a specific version.
      */
    var versionOverride: String = js.native
  }
  object NavigatorContext {
    
    @scala.inline
    def apply(
      absoluteUrl: String,
      addonKey: String,
      adminPageKey: String,
      contentId: String,
      contentType: page | blogpost,
      customData: String,
      dashboardId: String,
      issueKey: String,
      moduleKey: String,
      projectId: String,
      projectKey: String,
      relativeUrl: String,
      spaceKey: String,
      userAccountId: String,
      username: String,
      versionOverride: String
    ): NavigatorContext = {
      val __obj = js.Dynamic.literal(absoluteUrl = absoluteUrl.asInstanceOf[js.Any], addonKey = addonKey.asInstanceOf[js.Any], adminPageKey = adminPageKey.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], issueKey = issueKey.asInstanceOf[js.Any], moduleKey = moduleKey.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projectKey = projectKey.asInstanceOf[js.Any], relativeUrl = relativeUrl.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any], userAccountId = userAccountId.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], versionOverride = versionOverride.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigatorContext]
    }
    
    @scala.inline
    implicit class NavigatorContextMutableBuilder[Self <: NavigatorContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteUrl(value: String): Self = StObject.set(x, "absoluteUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonKey(value: String): Self = StObject.set(x, "addonKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminPageKey(value: String): Self = StObject.set(x, "adminPageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: page | blogpost): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomData(value: String): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashboardId(value: String): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbeddedContentRender(value: current | `version-at-save`): Self = StObject.set(x, "embeddedContentRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbeddedContentRenderUndefined: Self = StObject.set(x, "embeddedContentRender", js.undefined)
      
      @scala.inline
      def setIssueKey(value: String): Self = StObject.set(x, "issueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleKey(value: String): Self = StObject.set(x, "moduleKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectKey(value: String): Self = StObject.set(x, "projectKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUrl(value: String): Self = StObject.set(x, "relativeUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceKey(value: String): Self = StObject.set(x, "spaceKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAccountId(value: String): Self = StObject.set(x, "userAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionOverride(value: String): Self = StObject.set(x, "versionOverride", value.asInstanceOf[js.Any])
    }
  }
}
