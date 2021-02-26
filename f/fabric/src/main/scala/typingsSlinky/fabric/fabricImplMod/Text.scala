package typingsSlinky.fabric.fabricImplMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.anon.Baseline
import typingsSlinky.fabric.anon.CharIndex
import typingsSlinky.fabric.anon.DeltaY
import typingsSlinky.fabric.anon.FontFamily
import typingsSlinky.fabric.anon.GraphemeLines
import typingsSlinky.fabric.anon.KernedWidth
import typingsSlinky.fabric.anon.Left
import typingsSlinky.fabric.anon.NumOfSpaces
import typingsSlinky.fabric.fabricStrings._empty
import typingsSlinky.fabric.fabricStrings.italic
import typingsSlinky.fabric.fabricStrings.normal
import typingsSlinky.fabric.fabricStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fabric.fabricImplMod.IObjectOptions because Already inherited
- typingsSlinky.fabric.fabricImplMod.TextOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined fontSize, fontWeight, fontFamily, underline, overline, linethrough, textAlign, fontStyle, lineHeight, superscript, subscript, textBackgroundColor, charSpacing, styles, deltaY, text */ @JSImport("fabric/fabric-impl", "Text")
@js.native
class Text protected () extends Object {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: TextOptions) = this()
  
  /**
    * use this size when measuring text. To avoid IE11 rounding errors
    * @type {Number}
    * @default
    * @readonly
    * @private
    */
  var CACHE_FONT_SIZE: Double = js.native
  
  /**
    * Contains characters bounding boxes for each line and char
    * @private
    * @type Array of char grapheme bounding boxes
    */
  var __charBounds: js.UndefOr[js.Array[js.Array[DeltaY]]] = js.native
  
  /**
    * List of line heights
    * @private
    * @type Array<Number>
    */
  var __lineHeights: js.Array[Double] = js.native
  
  /**
    * List of line widths
    * @private
    * @type Array<Number>
    */
  var __lineWidths: js.Array[Double] = js.native
  
  /**
    * @private
    * @type boolean
    */
  var __skipDimension: Boolean = js.native
  
  /**
    * apply all the character style to canvas for rendering
    * @private
    * @param {String} _char
    * @param {CanvasRenderingContext2D} ctx Context to render on
    * @param {Number} lineIndex
    * @param {Number} charIndex
    * @param {Object} [decl]
    */
  def _applyCharStyles(
    method: String,
    ctx: CanvasRenderingContext2D,
    lineIndex: Double,
    charIndex: Double,
    styleDeclaration: js.Any
  ): Unit = js.native
  
  /**
    * @private
    */
  def _clearCache(): Unit = js.native
  
  /**
    * Properties which when set cause object to change dimensions
    * @type Object
    * @private
    */
  var _dimensionAffectingProps: js.Array[String] = js.native
  
  /**
    * @private
    * @type Number
    */
  var _fontSizeFraction: Double = js.native
  
  /**
    * Text Line proportion to font Size (in pixels)
    * @private
    * @type Number
    */
  var _fontSizeMult: Double = js.native
  
  /**
    * Generate an object that translates the style object so that it is
    * broken up by visual lines (new lines and automatic wrapping).
    * The original text styles object is broken up by actual lines (new lines only),
    * which is only sufficient for Text / IText
    * @private
    */
  def _generateStyleMap(textInfo: GraphemeLines): NumberDictionary[typingsSlinky.fabric.anon.Line] = js.native
  
  /**
    * @private
    * @param {Number} lineIndex index text line
    * @return {Number} Line left offset
    */
  def _getLineLeftOffset(lineIndex: Double): Double = js.native
  
  /**
    * get the reference, not a clone, of the style object for a given character
    * @param {Number} lineIndex
    * @param {Number} charIndex
    * @return {Object} style object
    */
  def _getStyleDeclaration(lineIndex: Double, charIndex: Double): js.Any = js.native
  
  /**
    * @private
    * Gets the width of character spacing
    */
  def _getWidthOfCharSpacing(): Double = js.native
  
  /**
    * @private
    * @param {Object} prevStyle
    * @param {Object} thisStyle
    */
  def _hasStyleChanged(prevStyle: js.Any, thisStyle: js.Any): Boolean = js.native
  
  /**
    * measure and return the width of a single character.
    * possibly overridden to accommodate different measure logic or
    * to hook some external lib for character measurement
    * @private
    * @param {String} char to be measured
    * @param {Object} charStyle style of char to be measured
    * @param {String} [previousChar] previous char
    * @param {Object} [prevCharStyle] style of previous char
    * @return {Object} object contained char width anf kerned width
    */
  def _measureChar(_char: String, charStyle: js.Any, previousChar: String, prevCharStyle: js.Any): KernedWidth = js.native
  
  /**
    * Use this regular expression to filter for whitespace that is not a new line.
    * Mostly used when text is 'justify' aligned.
    * @private
    * @type RegExp
    */
  var _reSpaceAndTab: js.RegExp = js.native
  
  /**
    * Use this regular expression to filter for whitespaces that is not a new line.
    * Mostly used when text is 'justify' aligned.
    * @private
    * @type RegExp
    */
  var _reSpacesAndTabs: js.RegExp = js.native
  
  /**
    * @private
    * @param {String} method
    * @param {CanvasRenderingContext2D} ctx Context to render on
    * @param {Number} lineIndex
    * @param {Number} charIndex
    * @param {String} _char
    * @param {Number} left Left coordinate
    * @param {Number} top Top coordinate
    * @param {Number} lineHeight Height of the line
    */
  def _renderChar(
    method: String,
    ctx: CanvasRenderingContext2D,
    lineIndex: Double,
    charIndex: Double,
    _char: String,
    left: Double,
    top: Double
  ): Unit = js.native
  
  /**
    * @private
    * @param {String} method
    * @param {CanvasRenderingContext2D} ctx Context to render on
    * @param {String} line Content of the line
    * @param {Number} left
    * @param {Number} top
    * @param {Number} lineIndex
    * @param {Number} charOffset
    */
  def _renderChars(
    method: String,
    ctx: CanvasRenderingContext2D,
    line: String,
    left: Double,
    top: Double,
    lineIndex: Double
  ): Unit = js.native
  
  /**
    * @private
    * @param {CanvasRenderingContext2D} ctx Context to render on
    */
  def _renderText(ctx: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * @private
    * @param {String} method Method name ("fillText" or "strokeText")
    * @param {CanvasRenderingContext2D} ctx Context to render on
    * @param {String} line Text to render
    * @param {Number} left Left position of text
    * @param {Number} top Top position of text
    * @param {Number} lineIndex Index of a line in a text
    */
  def _renderTextLine(
    method: String,
    ctx: CanvasRenderingContext2D,
    line: String,
    left: Double,
    top: Double,
    lineIndex: Double
  ): Unit = js.native
  /**
    * @private
    * @param {String} method Method name ("fillText" or "strokeText")
    * @param {CanvasRenderingContext2D} ctx Context to render on
    * @param {Array} line Text to render
    * @param {Number} left Left position of text
    * @param {Number} top Top position of text
    * @param {Number} lineIndex Index of a line in a text
    */
  def _renderTextLine(
    method: String,
    ctx: CanvasRenderingContext2D,
    line: js.Array[String],
    left: Double,
    top: Double,
    lineIndex: Double
  ): Unit = js.native
  
  /**
    * Set the font parameter of the context with the object properties or with charStyle
    * @private
    * @param {CanvasRenderingContext2D} ctx Context to render on
    * @param {Object} [charStyle] object with font style properties
    * @param {String} [charStyle.fontFamily] Font Family
    * @param {Number} [charStyle.fontSize] Font size in pixels. ( without px suffix )
    * @param {String} [charStyle.fontWeight] Font weight
    * @param {String} [charStyle.fontStyle] Font style (italic|normal)
    */
  def _setTextStyles(ctx: CanvasRenderingContext2D): Unit = js.native
  def _setTextStyles(ctx: CanvasRenderingContext2D, charStyle: js.UndefOr[scala.Nothing], forMeasuring: Boolean): Unit = js.native
  def _setTextStyles(ctx: CanvasRenderingContext2D, charStyle: FontFamily): Unit = js.native
  def _setTextStyles(ctx: CanvasRenderingContext2D, charStyle: FontFamily, forMeasuring: Boolean): Unit = js.native
  
  /**
    * @private
    */
  def _shouldClearDimensionCache(): Boolean = js.native
  
  /**
    * Divides text into lines of text and lines of graphemes.
    * @private
    * @returns {Object} Lines and text in the text
    */
  def _splitText(): GraphemeLines = js.native
  
  var _text: js.Array[String] = js.native
  
  /**
    * List of grapheme lines in text object
    * @private
    * @type Array<string>
    */
  var _textLines: js.Array[js.Array[String]] = js.native
  
  /**
    * List of unwrapped grapheme lines in text object
    * @private
    * @type Array<string>
    */
  var _unwrappedTextLines: js.Array[js.Array[String]] = js.native
  
  /**
    * Calculate text box height
    */
  def calcTextHeight(): Double = js.native
  
  /**
    * additional space between characters
    * expressed in thousands of em unit
    * @type Number
    */
  var charSpacing: js.UndefOr[Double] = js.native
  
  /**
    * Check if characters in a text have a value for a property
    * whose value matches the textbox's value for that property.  If so,
    * the character-level property is deleted.  If the character
    * has no other properties, then it is also deleted.  Finally,
    * if the line containing that character has no other characters
    * then it also is deleted.
    *
    * @param {string} property The property to compare between characters and text.
    */
  def cleanStyle(property: String): Unit = js.native
  
  var cursorOffsetCache: Left = js.native
  
  /**
    * Baseline shift, stlyes only, keep at 0 for the main text object
    * @type {Number}
    */
  var deltaY: js.UndefOr[Double] = js.native
  
  /**
    * Enlarge space boxes and shift the others
    */
  def enlargeSpaces(): Unit = js.native
  
  /**
    * Font family
    * @type String
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Font size (in pixels)
    * @type Number
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Font style . Possible values: "", "normal", "italic" or "oblique".
    * @type String
    */
  var fontStyle: js.UndefOr[_empty | normal | italic | oblique] = js.native
  
  /**
    * Font weight (e.g. bold, normal, 400, 600, 800)
    * @type {(Number|String)}
    */
  var fontWeight: js.UndefOr[String | Double] = js.native
  
  /**
    * Returns 2d representation (lineIndex and charIndex) of cursor (or selection start)
    * @param {Number} [selectionStart] Optional index. When not given, current selectionStart is used.
    * @param {Boolean} [skipWrapping] consider the location for unwrapped lines. usefull to manage styles.
    */
  def get2DCursorLocation(): CharIndex = js.native
  def get2DCursorLocation(selectionStart: js.UndefOr[scala.Nothing], skipWrapping: Boolean): CharIndex = js.native
  def get2DCursorLocation(selectionStart: Double): CharIndex = js.native
  def get2DCursorLocation(selectionStart: Double, skipWrapping: Boolean): CharIndex = js.native
  
  /**
    * return a new object that contains all the style property for a character
    * the object returned is newly created
    * @param {Number} lineIndex of the line where the character is
    * @param {Number} charIndex position of the character on the line
    * @return {Object} style object
    */
  def getCompleteStyleDeclaration(lineIndex: Double, charIndex: Double): js.Any = js.native
  
  /**
    * Computes height of character at given position
    * @param {Number} line the line number
    * @param {Number} char the character number
    * @return {Number} fontSize of the character
    */
  def getHeightOfChar(line: Double, char: Double): Double = js.native
  
  /**
    * Calculate height of line at 'lineIndex'
    * @param {Number} lineIndex index of line to calculate
    * @return {Number}
    */
  def getHeightOfLine(lineIndex: Double): Double = js.native
  
  /**
    * Measure a single line given its index. Used to calculate the initial
    * text bounding box. The values are calculated and stored in __lineWidths cache.
    * @private
    * @param {Number} lineIndex line number
    * @return {Number} Line width
    */
  def getLineWidth(lineIndex: Double): Double = js.native
  
  /**
    * Return a context for measurement of text string.
    * if created it gets stored for reuse
    * @return {fabric.Text} thisArg
    */
  def getMeasuringContext(): CanvasRenderingContext2D = js.native
  
  /**
    * Gets style of a current selection/cursor (at the start position)
    * if startIndex or endIndex are not provided, slectionStart or selectionEnd will be used.
    * @param {Number} [startIndex] Start index to get styles at
    * @param {Number} [endIndex] End index to get styles at, if not specified selectionEnd or startIndex + 1
    * @param {Boolean} [complete] get full style or not
    * @return {Array} styles an array with one, zero or more Style objects
    */
  def getSelectionStyles(): js.Array[_] = js.native
  def getSelectionStyles(startIndex: js.UndefOr[scala.Nothing], endIndex: js.UndefOr[scala.Nothing], complete: Boolean): js.Array[_] = js.native
  def getSelectionStyles(startIndex: js.UndefOr[scala.Nothing], endIndex: Double): js.Array[_] = js.native
  def getSelectionStyles(startIndex: js.UndefOr[scala.Nothing], endIndex: Double, complete: Boolean): js.Array[_] = js.native
  def getSelectionStyles(startIndex: Double): js.Array[_] = js.native
  def getSelectionStyles(startIndex: Double, endIndex: js.UndefOr[scala.Nothing], complete: Boolean): js.Array[_] = js.native
  def getSelectionStyles(startIndex: Double, endIndex: Double): js.Array[_] = js.native
  def getSelectionStyles(startIndex: Double, endIndex: Double, complete: Boolean): js.Array[_] = js.native
  
  /**
    * Retrieves the value of property at given character position
    * @param {Number} lineIndex the line number
    * @param {Number} charIndex the charater number
    * @param {String} property the property name
    * @returns the value of 'property'
    */
  def getValueOfPropertyAt(lineIndex: Double, charIndex: Double, property: String): js.Any = js.native
  
  /**
    * Initialize or update text dimensions.
    * Updates this.width and this.height with the proper values.
    * Does not return dimensions.
    */
  def initDimensions(): Unit = js.native
  
  /**
    * Returns true if object has no styling or no styling in a line
    * @param {Number} lineIndex , lineIndex is on wrapped lines.
    * @return {Boolean}
    */
  def isEmptyStyles(lineIndex: Double): Boolean = js.native
  
  /**
    * Detect if the text line is ended with an hard break
    * text and itext do not have wrapping, return false
    * @return {Boolean}
    */
  def isEndOfWrapping(lineIndex: Double): Boolean = js.native
  
  /**
    * Line height
    * @type Number
    */
  var lineHeight: js.UndefOr[Double] = js.native
  
  /**
    * Text decoration linethrough.
    * @type Boolean
    */
  var linethrough: js.UndefOr[Boolean] = js.native
  
  /**
    * measure a text line measuring all characters.
    * @param {Number} lineIndex line number
    * @return {Object} object.width total width of characters
    * @return {Object} object.numOfSpaces length of chars that match this._reSpacesAndTabs
    */
  def measureLine(lineIndex: Double): NumOfSpaces = js.native
  
  /**
    * Text decoration overline.
    * @type Boolean
    */
  var overline: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove a style property or properties from all individual character styles
    * in a text object.  Deletes the character style object if it contains no other style
    * props.  Deletes a line style object if it contains no other character styles.
    *
    * @param {String} props The property to remove from character styles.
    */
  def removeStyle(property: String): Unit = js.native
  
  /**
    * Sets style of a current selection, if no selection exist, do not set anything.
    * @param {Object} [styles] Styles object
    * @param {Number} [startIndex] Start index to get styles at
    * @param {Number} [endIndex] End index to get styles at, if not specified selectionEnd or startIndex + 1
    * @return {fabric.IText} thisArg
    * @chainable
    */
  def setSelectionStyles(styles: js.Any): Text = js.native
  def setSelectionStyles(styles: js.Any, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Text = js.native
  def setSelectionStyles(styles: js.Any, startIndex: Double): Text = js.native
  def setSelectionStyles(styles: js.Any, startIndex: Double, endIndex: Double): Text = js.native
  
  /**
    * Turns the character into an 'inferior figure' (i.e. 'subscript')
    * @param {Number} start selection start
    * @param {Number} end selection end
    * @returns {fabric.Text} thisArg
    * @chainable
    */
  def setSubscript(start: Double, end: Double): Text = js.native
  
  /**
    * Turns the character into a 'superior figure' (i.e. 'superscript')
    * @param {Number} start selection start
    * @param {Number} end selection end
    * @returns {fabric.Text} thisArg
    * @chainable
    */
  def setSuperscript(start: Double, end: Double): Text = js.native
  
  /**
    * Returns true if object has a style property or has it ina specified line
    * @param {Number} lineIndex
    * @return {Boolean}
    */
  def styleHas(property: String): Boolean = js.native
  def styleHas(property: String, lineIndex: Double): Boolean = js.native
  
  /**
    * Object containing character styles - top-level properties -> line numbers,
    * 2nd-level properties - charater numbers
    * @type Object
    */
  var styles: js.UndefOr[js.Any] = js.native
  
  /**
    * Subscript schema object (minimum overlap)
    * @type {Object}
    */
  var subscript: js.UndefOr[Baseline] = js.native
  
  /**
    * Superscript schema object (minimum overlap)
    * @type {Object}
    */
  var superscript: js.UndefOr[Baseline] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  /**
    * Text alignment. Possible values: "left", "center", "right", "justify",
    * "justify-left", "justify-center" or "justify-right".
    * @type String
    */
  var textAlign: js.UndefOr[String] = js.native
  
  /**
    * Background color of text lines
    * @type String
    */
  var textBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * List of lines in text object
    * @type Array<string>
    */
  var textLines: js.Array[String] = js.native
  
  /**
    * Text decoration underline.
    * @type Boolean
    */
  var underline: js.UndefOr[Boolean] = js.native
}
/* static members */
object Text {
  
  @JSImport("fabric/fabric-impl", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric/fabric-impl", "Text.DEFAULT_SVG_FONT_SIZE")
  @js.native
  def DEFAULT_SVG_FONT_SIZE: Double = js.native
  @scala.inline
  def DEFAULT_SVG_FONT_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SVG_FONT_SIZE")(x.asInstanceOf[js.Any])
  
  /**
    * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    * @static
    * @memberOf fabric.Text
    * @param {SVGElement} element Element to parse
    * @param {Function} callback callback function invoked after parsing
    * @param {Object} [options] Options object
    */
  @JSImport("fabric/fabric-impl", "Text.fromElement")
  @js.native
  def fromElement(element: SVGElement): Text = js.native
  @JSImport("fabric/fabric-impl", "Text.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.UndefOr[scala.Nothing], options: TextOptions): Text = js.native
  @JSImport("fabric/fabric-impl", "Text.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function): Text = js.native
  @JSImport("fabric/fabric-impl", "Text.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): Text = js.native
  
  /**
    * Returns fabric.Text instance from an object representation
    * @static
    * @memberOf fabric.Text
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    */
  @JSImport("fabric/fabric-impl", "Text.fromObject")
  @js.native
  def fromObject(`object`: js.Any): Text = js.native
  @JSImport("fabric/fabric-impl", "Text.fromObject")
  @js.native
  def fromObject(`object`: js.Any, callback: js.Function): Text = js.native
}
