package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "blogger_v3")
@js.native
object blogger_v3 extends js.Object {
  /**
    * Blogger API
    *
    * API for access to the data within Blogger.
    *
    * @example
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * @namespace blogger
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Blogger
    */
  @js.native
  class Blogger protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Blogger {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Blogs protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Blogs {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Bloguserinfos protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Bloguserinfos {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Comments protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Comments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Pages protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Pages {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Pageviews protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Pageviews {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Posts protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Posts {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Postuserinfos protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Postuserinfos {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Users protected ()
    extends typingsSlinky.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Resource$Users {
    def this(context: APIRequestContext) = this()
  }
  
}

