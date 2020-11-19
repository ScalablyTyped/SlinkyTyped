package typingsSlinky.nodegit

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodegit.mod.Index
import typingsSlinky.nodegit.strArrayMod.Strarray
import typingsSlinky.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/checkout-options", JSImport.Namespace)
@js.native
object checkoutOptionsMod extends js.Object {
  
  @js.native
  class CheckoutOptions ()
    extends /* key */ StringDictionary[js.Any] {
    
    var ancestorLabel: js.UndefOr[String] = js.native
    
    var baseline: js.UndefOr[Tree] = js.native
    
    var baselineIndex: js.UndefOr[Index] = js.native
    
    var checkoutStrategy: js.UndefOr[Double] = js.native
    
    var dirMode: js.UndefOr[Double] = js.native
    
    var disableFilters: js.UndefOr[Double] = js.native
    
    var fileMode: js.UndefOr[Double] = js.native
    
    var fileOpenFlags: js.UndefOr[Double] = js.native
    
    var notifyCb: js.UndefOr[js.Any] = js.native
    
    var notifyFlags: js.UndefOr[Double] = js.native
    
    var notifyPayload: js.UndefOr[scala.Nothing] = js.native
    
    var ourLabel: js.UndefOr[String] = js.native
    
    var paths: js.UndefOr[Strarray | String | js.Array[String]] = js.native
    
    var perfdataCb: js.UndefOr[js.Any] = js.native
    
    var perfdataPayload: js.UndefOr[scala.Nothing] = js.native
    
    var progressCb: js.UndefOr[js.Any] = js.native
    
    var progressPayload: js.UndefOr[scala.Nothing] = js.native
    
    var targetDirectory: js.UndefOr[String] = js.native
    
    var theirLabel: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
