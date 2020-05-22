package typingsSlinky.activexInfopath.global.InfoPath

import typingsSlinky.activexInfopath.InfoPath.XdSignatureAppearanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureLineObject")
@js.native
class SignatureLineObject protected ()
  extends typingsSlinky.activexInfopath.InfoPath.SignatureLineObject {
  /* CompleteClass */
  override val Id: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.SignatureLineObject_typekey")
  override var InfoPathDotSignatureLineObject_typekey: typingsSlinky.activexInfopath.InfoPath.SignatureLineObject = js.native
  /* CompleteClass */
  override val Signature: typingsSlinky.activexInfopath.InfoPath.SignatureObject = js.native
  /* CompleteClass */
  override val SignatureAppearanceType: XdSignatureAppearanceType = js.native
  /* CompleteClass */
  override var SuggestedSigner: String = js.native
  /* CompleteClass */
  override var SuggestedSignerEmailAddress: String = js.native
  /* CompleteClass */
  override var SuggestedSignerTitle: String = js.native
  /* CompleteClass */
  override def Sign(
    bstrImageURL: String,
    bstrSuggestedSigner: String,
    bstrSuggestedSignerTitle: String,
    bstrSuggestedSignerEmailAddress: String
  ): Boolean = js.native
}

