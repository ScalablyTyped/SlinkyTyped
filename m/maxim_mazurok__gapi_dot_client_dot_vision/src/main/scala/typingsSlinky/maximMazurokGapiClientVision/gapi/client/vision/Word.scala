package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Word extends js.Object {
  
  /**
    * The bounding box for the word. The vertices are in the order of top-left, top-right, bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
    * represented as around the top-left corner as defined when the text is read in the 'natural' orientation. For example: * when the text is horizontal it might look like: 0----1 | |
    * 3----2 * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[BoundingPoly] = js.native
  
  /** Confidence of the OCR results for the word. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Additional information detected for the word. */
  var property: js.UndefOr[TextProperty] = js.native
  
  /** List of symbols in the word. The order of the symbols follows the natural reading order. */
  // tslint:disable-next-line:ban-types
  var symbols: js.UndefOr[js.Array[Symbol]] = js.native
}
object Word {
  
  @scala.inline
  def apply(): Word = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Word]
  }
  
  @scala.inline
  implicit class WordOps[Self <: Word] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingBox(value: BoundingPoly): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setProperty(value: TextProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: Symbol*): Self = this.set("symbols", js.Array(value :_*))
    
    @scala.inline
    def setSymbols(value: js.Array[Symbol]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
}
