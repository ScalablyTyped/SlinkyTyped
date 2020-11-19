package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.ckeditor.Window
import typingsSlinky.ckeditor.anon.Aria
import typingsSlinky.ckeditor.anon.Bottom
import typingsSlinky.ckeditor.anon.Color
import typingsSlinky.ckeditor.anon.Display
import typingsSlinky.ckeditor.anon.Input
import typingsSlinky.ckeditor.anon.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.tools")
@js.native
object tools extends js.Object {
  
  def addFunction(fn: js.Function0[_]): Double = js.native
  def addFunction(fn: js.Function0[_], scope: js.Any): Double = js.native
  
  def arrayCompare(arrayA: js.Array[_], arrayB: js.Array[_]): Boolean = js.native
  
  def clone(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  def copy(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  def createClass(definition: StringDictionary[js.Any]): js.Any = js.native
  
  def cssStyleToDomStyle(cssName: String): String = js.native
  
  def cssVendorPrefix(property: String, value: String): StringDictionary[String | Double] = js.native
  def cssVendorPrefix(property: String, value: String, asString: Boolean): StringDictionary[String | Double] = js.native
  
  def defer[T /* <: js.Function */](fn: T): T = js.native
  
  def enableHtml5Elements(doc: Document): Unit = js.native
  def enableHtml5Elements(doc: DocumentFragment): Unit = js.native
  def enableHtml5Elements(doc: DocumentFragment, withAppend: Boolean): Unit = js.native
  def enableHtml5Elements(doc: Document, withAppend: Boolean): Unit = js.native
  
  def escapeCss(selector: String): String = js.native
  
  def eventsBuffer(minInterval: Double, output: js.Function0[Unit], scopeObj: js.Any): Input = js.native
  
  def extend(
    target: StringDictionary[js.Any],
    source: StringDictionary[js.Any],
    overwrite: Boolean,
    properties: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = js.native
  
  def fixDomain(): Boolean = js.native
  
  def genKey(subKey: String): String = js.native
  
  def getCookie(name: String): String = js.native
  
  def getCsrfToken(): String = js.native
  
  def getIndex[T](array: js.Array[T], compareFunction: js.Function1[/* element */ T, Boolean]): Double = js.native
  
  def getMouseButton(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event): Boolean = js.native
  
  def getNextId(): String = js.native
  
  def getNextNumber(): Double = js.native
  
  def getUniqueId(): String = js.native
  
  def htmlDecode(text: String): String = js.native
  
  def htmlDecodeAttr(text: String): String = js.native
  
  def htmlEncode(text: String): String = js.native
  
  def htmlEncodeAttr(text: String): String = js.native
  
  def indexOf[T](array: js.Array[T], value: T): Double = js.native
  def indexOf[T](array: js.Array[T], value: js.Function1[/* el */ T, Boolean]): Double = js.native
  
  def isArray[T](`object`: js.Any): /* is std.Array<T> */ Boolean = js.native
  
  def isEmpty(`object`: StringDictionary[js.Any]): Boolean = js.native
  
  def keystrokeToArray(lang: StringDictionary[js.Any], keystroke: Double): Aria = js.native
  
  def keystrokeToString(lang: StringDictionary[js.Any], keystroke: Double): Display = js.native
  
  def ltrim(str: String): String = js.native
  
  def normalizeCssText(styleText: String, nativeNormalize: Boolean): String = js.native
  
  def normalizeHex(styleText: String): String = js.native
  
  def objectCompare(left: StringDictionary[js.Any], right: StringDictionary[js.Any]): Boolean = js.native
  def objectCompare(left: StringDictionary[js.Any], right: StringDictionary[js.Any], onlyLef: Boolean): Boolean = js.native
  
  def objectKeys(obj: StringDictionary[js.Any]): js.Array[String] = js.native
  
  def `override`[T /* <: js.Function */](originalFunction: T, functionBuilder: js.Function1[/* originalFunction */ T, T]): T = js.native
  
  def parseCssText(styleText: String): StringDictionary[js.Any] = js.native
  def parseCssText(styleText: String, normalize: js.UndefOr[scala.Nothing], nativeNormalize: Boolean): StringDictionary[js.Any] = js.native
  def parseCssText(styleText: String, normalize: Boolean): StringDictionary[js.Any] = js.native
  def parseCssText(styleText: String, normalize: Boolean, nativeNormalize: Boolean): StringDictionary[js.Any] = js.native
  
  def prototypedCopy(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  def removeFunction(ref: Double): Unit = js.native
  
  def repeat(str: String, times: Double): String = js.native
  
  def rtrim(str: String): String = js.native
  
  def search[T](array: js.Array[T], value: T): T = js.native
  def search[T](array: js.Array[T], value: js.Function1[/* element */ T, Boolean]): T = js.native
  
  def setCookie(name: String, value: String): Unit = js.native
  
  def setTimeout(func: js.Function): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: js.Any
  ): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  def setTimeout(func: js.Function, milliseconds: js.UndefOr[scala.Nothing], scope: StringDictionary[js.Any]): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: StringDictionary[js.Any],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: StringDictionary[js.Any],
    args: js.Any
  ): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: StringDictionary[js.Any],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  def setTimeout(func: js.Function, milliseconds: Double): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: js.UndefOr[scala.Nothing],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  def setTimeout(func: js.Function, milliseconds: Double, scope: js.UndefOr[scala.Nothing], args: js.Any): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: js.UndefOr[scala.Nothing],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  def setTimeout(func: js.Function, milliseconds: Double, scope: StringDictionary[js.Any]): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: StringDictionary[js.Any],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  def setTimeout(func: js.Function, milliseconds: Double, scope: StringDictionary[js.Any], args: js.Any): Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: StringDictionary[js.Any],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  
  def transformPlainTextToHtml(text: String, etnerMode: Double): String = js.native
  
  def trim(str: String): String = js.native
  
  def tryThese(fn: js.Array[js.Function]): js.Any = js.native
  
  def writeCssText(styles: StringDictionary[js.Any]): String = js.native
  def writeCssText(styles: StringDictionary[js.Any], sort: Boolean): String = js.native
  
  @js.native
  object array extends js.Object {
    
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
    ): Boolean = js.native
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: StringDictionary[js.Any]
    ): Boolean = js.native
    
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
    ): js.Array[T] = js.native
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: StringDictionary[js.Any]
    ): js.Array[T] = js.native
    
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]
    ): Unit = js.native
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: StringDictionary[js.Any]
    ): Unit = js.native
    
    def isArray(`object`: js.Any): Boolean = js.native
    
    def map[T, K](array: js.Array[T], fn: js.Function1[/* value */ T, K]): js.Array[K] = js.native
    def map[T, K](array: js.Array[T], fn: js.Function1[/* value */ T, K], thisArg: StringDictionary[js.Any]): js.Array[K] = js.native
    
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ Double, /* array */ js.Array[T], K],
      initial: K
    ): K = js.native
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ Double, /* array */ js.Array[T], K],
      initial: K,
      thisArg: StringDictionary[js.Any]
    ): K = js.native
  }
  
  @js.native
  object `object` extends js.Object {
    
    def findKey(obj: StringDictionary[js.Any], value: js.Any): String = js.native
    
    def merge(obj1: StringDictionary[js.Any], obj2: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  object style extends js.Object {
    
    @js.native
    object parse extends js.Object {
      
      def background(value: String): Color = js.native
      
      def border(value: String): Style = js.native
      
      def margin(value: String): Bottom = js.native
    }
  }
}
