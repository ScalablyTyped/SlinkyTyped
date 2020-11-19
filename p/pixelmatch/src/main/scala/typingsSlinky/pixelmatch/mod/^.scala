package typingsSlinky.pixelmatch.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixelmatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    /** Image data of the first image to compare. Note: image dimensions must be equal. */
  img1: Buffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray,
    /** Image data of the second image to compare. Note: image dimensions must be equal. */
  img2: Buffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray,
    /** Image data to write the diff to, or null if don't need a diff image. */
  output: Buffer | js.typedarray.Uint8Array | Null,
    /** Width of the images. Note that all three images need to have the same dimensions. */
  width: Double,
    /** Height of the images. Note that all three images need to have the same dimensions. */
  height: Double,
    /** Options. */
  options: js.UndefOr[Options]
  ): Double = js.native
}
