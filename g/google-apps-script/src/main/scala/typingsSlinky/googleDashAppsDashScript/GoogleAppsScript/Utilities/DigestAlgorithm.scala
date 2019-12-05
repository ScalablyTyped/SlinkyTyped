package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigestAlgorithm extends js.Object

/**
  * Selector of Digest algorithm.
  */
@JSGlobal("GoogleAppsScript.Utilities.DigestAlgorithm")
@js.native
object DigestAlgorithm extends js.Object {
  @js.native
  sealed trait MD2
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm
  
  @js.native
  sealed trait MD5
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm
  
  @js.native
  sealed trait SHA_1
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm
  
  @js.native
  sealed trait SHA_256
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm
  
  @js.native
  sealed trait SHA_384
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm
  
  @js.native
  sealed trait SHA_512
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm
  
  /* 0 */ val MD2: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.MD2 with Double = js.native
  /* 1 */ val MD5: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.MD5 with Double = js.native
  /* 2 */ val SHA_1: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_1 with Double = js.native
  /* 3 */ val SHA_256: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_256 with Double = js.native
  /* 4 */ val SHA_384: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_384 with Double = js.native
  /* 5 */ val SHA_512: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_512 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm with Double
  ] = js.native
}

