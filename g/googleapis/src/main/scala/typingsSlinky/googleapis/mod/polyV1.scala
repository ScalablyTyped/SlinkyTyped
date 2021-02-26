package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyV1 {
  
  /**
    * Poly API
    *
    * The Poly API provides read access to assets hosted on &lt;a
    * href=&quot;https://poly.google.com&quot;&gt;poly.google.com&lt;/a&gt; to
    * all, and upload access to &lt;a
    * href=&quot;https://poly.google.com&quot;&gt;poly.google.com&lt;/a&gt; for
    * whitelisted accounts.
    *
    * @example
    * const {google} = require('googleapis');
    * const poly = google.poly('v1');
    *
    * @namespace poly
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Poly
    */
  @JSImport("googleapis", "poly_v1.Poly")
  @js.native
  class Poly protected ()
    extends typingsSlinky.googleapis.polyV1Mod.polyV1.Poly {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Assets")
  @js.native
  class ResourceAssets protected ()
    extends typingsSlinky.googleapis.polyV1Mod.polyV1.ResourceAssets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typingsSlinky.googleapis.polyV1Mod.polyV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Users$Assets")
  @js.native
  class ResourceUsersAssets protected ()
    extends typingsSlinky.googleapis.polyV1Mod.polyV1.ResourceUsersAssets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Users$Likedassets")
  @js.native
  class ResourceUsersLikedassets protected ()
    extends typingsSlinky.googleapis.polyV1Mod.polyV1.ResourceUsersLikedassets {
    def this(context: APIRequestContext) = this()
  }
}
