package typingsSlinky.gapiClientBlogger

import typingsSlinky.gapiClientBlogger.gapi.client.blogger.BlogUserInfosResource
import typingsSlinky.gapiClientBlogger.gapi.client.blogger.BlogsResource
import typingsSlinky.gapiClientBlogger.gapi.client.blogger.CommentsResource
import typingsSlinky.gapiClientBlogger.gapi.client.blogger.PageViewsResource
import typingsSlinky.gapiClientBlogger.gapi.client.blogger.PagesResource
import typingsSlinky.gapiClientBlogger.gapi.client.blogger.PostUserInfosResource
import typingsSlinky.gapiClientBlogger.gapi.client.blogger.PostsResource
import typingsSlinky.gapiClientBlogger.gapi.client.blogger.UsersResource
import typingsSlinky.gapiClientBlogger.gapiClientBloggerStrings.blogger
import typingsSlinky.gapiClientBlogger.gapiClientBloggerStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      val blogUserInfos: BlogUserInfosResource = js.native
      
      val blogs: BlogsResource = js.native
      
      val comments: CommentsResource = js.native
      
      /** Load Blogger API v3 */
      def load(name: blogger, version: v3): js.Thenable[Unit] = js.native
      def load(name: blogger, version: v3, callback: js.Function0[_]): Unit = js.native
      
      val pageViews: PageViewsResource = js.native
      
      val pages: PagesResource = js.native
      
      val postUserInfos: PostUserInfosResource = js.native
      
      val posts: PostsResource = js.native
      
      val users: UsersResource = js.native
    }
  }
}
