package typingsSlinky.dv.dvMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dv.dvStrings.auto
import typingsSlinky.dv.dvStrings.auto_only
import typingsSlinky.dv.dvStrings.auto_osd
import typingsSlinky.dv.dvStrings.box
import typingsSlinky.dv.dvStrings.circle_word
import typingsSlinky.dv.dvStrings.hocr
import typingsSlinky.dv.dvStrings.osd_only
import typingsSlinky.dv.dvStrings.plain
import typingsSlinky.dv.dvStrings.single_block
import typingsSlinky.dv.dvStrings.single_block_vert_text
import typingsSlinky.dv.dvStrings.single_char
import typingsSlinky.dv.dvStrings.single_column
import typingsSlinky.dv.dvStrings.single_line
import typingsSlinky.dv.dvStrings.single_word
import typingsSlinky.dv.dvStrings.sparse_text
import typingsSlinky.dv.dvStrings.sparse_text_osd
import typingsSlinky.dv.dvStrings.unlv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dv", "Tesseract")
@js.native
/**
	 * Creates a Tesseract engine with language set to english.
	 */
class Tesseract ()
  extends /* key */ StringDictionary[js.Any] {
  def this(datapath: String) = this()
  /**
  	 * Creates a Tesseract engine with the specified language.
  	 */
  def this(lang: String, image: Image) = this()
  /**
  	 * Creates a Tesseract engine with the specified language and image.
  	 */
  def this(datapath: String, lang: String, image: Image) = this()
  /**
  	 * Accessor for the input image.
  	 */
  var image: Image = js.native
  /**
  	 * Accessor for the page segmentation mode.
  	 */
  var pageSegMode: osd_only | auto_osd | auto_only | auto | single_column | single_block_vert_text | single_block | single_line | single_word | circle_word | single_char | sparse_text | sparse_text_osd = js.native
  /**
  	 * Accessor for the rectangle that specifies a "visible" area on the image.
  	 */
  var rectangle: Rect = js.native
  /**
  	 * Clears the tesseract image and its last results.
  	 */
  def clear(): Unit = js.native
  /**
  	 * Clears all adaptive classifiers (use this when results vary during scanning).
  	 */
  def clearAdaptiveClassifier(): Unit = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findParagraphs(recognize: Boolean): js.Array[Paragaph] = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findRegions(recognize: Boolean): js.Array[Region] = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findSymbols(recognize: Boolean): js.Array[js.Symbol] = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findTextLines(recognize: Boolean): js.Array[Textline] = js.native
  @JSName("findText")
  def findText_box(format: box, pageNumber: Double): String = js.native
  @JSName("findText")
  def findText_hocr(format: hocr, pageNumber: Double): String = js.native
  /**
  	 * Returns text in the specified format. Valid formats are: plain, unlv.
  	 */
  @JSName("findText")
  def findText_plain(format: plain): String = js.native
  @JSName("findText")
  def findText_plain(format: plain, withConfidence: Boolean): String = js.native
  @JSName("findText")
  def findText_unlv(format: unlv): String = js.native
  @JSName("findText")
  def findText_unlv(format: unlv, withConfidence: Boolean): String = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findWords(recognize: Boolean): js.Array[Word] = js.native
  /**
  	 * Returns the binarized image Tesseract uses for its recognition.
  	 */
  def thresholdImage(): Image = js.native
}

