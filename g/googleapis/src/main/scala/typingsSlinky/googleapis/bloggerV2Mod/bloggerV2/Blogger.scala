package typingsSlinky.googleapis.bloggerV2Mod.bloggerV2

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Blogger API
  *
  * API for access to the data within Blogger.
  *
  * @example
  * const {google} = require('googleapis');
  * const blogger = google.blogger('v2');
  *
  * @namespace blogger
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Blogger
  */
@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Blogger")
@js.native
class Blogger protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var blogs: ResourceBlogs = js.native
  
  var comments: ResourceComments = js.native
  
  var context: APIRequestContext = js.native
  
  var pages: ResourcePages = js.native
  
  var posts: ResourcePosts = js.native
  
  var users: ResourceUsers = js.native
}
