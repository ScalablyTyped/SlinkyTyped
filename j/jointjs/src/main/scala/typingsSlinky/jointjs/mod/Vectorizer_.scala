package typingsSlinky.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGMatrix
import org.scalajs.dom.raw.SVGPoint
import typingsSlinky.jointjs.mod.Vectorizer.GetBBoxOptions
import typingsSlinky.jointjs.mod.Vectorizer.Matrix
import typingsSlinky.jointjs.mod.Vectorizer.RotateOptions
import typingsSlinky.jointjs.mod.Vectorizer.Rotation
import typingsSlinky.jointjs.mod.Vectorizer.Sample
import typingsSlinky.jointjs.mod.Vectorizer.Scale
import typingsSlinky.jointjs.mod.Vectorizer.TextOptions
import typingsSlinky.jointjs.mod.Vectorizer.TransformOptions
import typingsSlinky.jointjs.mod.Vectorizer.Translation
import typingsSlinky.jointjs.mod.g.PlainPoint
import typingsSlinky.jointjs.mod.g.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "Vectorizer")
@js.native
class Vectorizer_ protected () extends js.Object {
  def this(el: String) = this()
  def this(el: SVGElement) = this()
  def this(el: String, attrs: StringDictionary[js.Any]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any]) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  var id: String = js.native
  var node: SVGElement = js.native
  def addClass(className: String): Vectorizer = js.native
  def animateAlongPath(attrs: StringDictionary[js.Any], path: Vectorizer): Unit = js.native
  def animateAlongPath(attrs: StringDictionary[js.Any], path: SVGElement): Unit = js.native
  def append(els: js.Array[SVGElement | Vectorizer]): this.type = js.native
  def append(els: Vectorizer): this.type = js.native
  def append(els: SVGElement): this.type = js.native
  def appendTo(el: Vectorizer): this.type = js.native
  def appendTo(el: SVGElement): this.type = js.native
  def attr(): StringDictionary[String] = js.native
  def attr(attrs: StringDictionary[js.Any]): this.type = js.native
  def attr(name: String): String | Null = js.native
  def attr(name: String, value: js.Any): this.type = js.native
  def bbox(): Rect = js.native
  def bbox(withoutTransformations: Boolean): Rect = js.native
  def bbox(withoutTransformations: Boolean, target: Vectorizer): Rect = js.native
  def bbox(withoutTransformations: Boolean, target: SVGElement): Rect = js.native
  def before(els: js.Array[SVGElement | Vectorizer]): this.type = js.native
  def before(els: Vectorizer): this.type = js.native
  def before(els: SVGElement): this.type = js.native
  def children(): js.Array[Vectorizer] = js.native
  def contains(el: Vectorizer): Boolean = js.native
  def contains(el: SVGElement): Boolean = js.native
  def convertToPath(): Vectorizer = js.native
  def convertToPathData(): String = js.native
  def defs(): js.UndefOr[Vectorizer] = js.native
  def empty(): this.type = js.native
  def find(selector: String): js.Array[Vectorizer] = js.native
  def findIntersection(ref: PlainPoint, target: Vectorizer): js.UndefOr[PlainPoint] = js.native
  def findIntersection(ref: PlainPoint, target: SVGElement): js.UndefOr[PlainPoint] = js.native
  def findOne(selector: String): js.UndefOr[Vectorizer] = js.native
  def findParentByClass(className: String): Vectorizer | Null = js.native
  def findParentByClass(className: String, terminator: SVGElement): Vectorizer | Null = js.native
  def getBBox(): Rect = js.native
  def getBBox(opt: GetBBoxOptions): Rect = js.native
  def getTransformToElement(toElem: Vectorizer): SVGMatrix = js.native
  def getTransformToElement(toElem: SVGGElement): SVGMatrix = js.native
  def hasClass(className: String): Boolean = js.native
  def index(): Double = js.native
  def normalizePath(): this.type = js.native
  def prepend(els: js.Array[SVGElement | Vectorizer]): this.type = js.native
  def prepend(els: Vectorizer): this.type = js.native
  def prepend(els: SVGElement): this.type = js.native
  def remove(): this.type = js.native
  def removeAttr(name: String): this.type = js.native
  def removeClass(className: String): this.type = js.native
  def rotate(): Rotation = js.native
  def rotate(angle: Double): this.type = js.native
  def rotate(angle: Double, cx: Double): this.type = js.native
  def rotate(angle: Double, cx: Double, cy: Double): this.type = js.native
  def rotate(angle: Double, cx: Double, cy: Double, opt: RotateOptions): this.type = js.native
  def sample(): js.Array[Sample] = js.native
  def sample(interval: Double): js.Array[Sample] = js.native
  def scale(): Scale = js.native
  def scale(sx: Double): this.type = js.native
  def scale(sx: Double, sy: Double): this.type = js.native
  /* private */ def setAttribute(name: String, value: String): this.type = js.native
  /* private */ def setAttributes(attrs: StringDictionary[js.Any]): this.type = js.native
  // returns either this or Vectorizer, no point in specifying this.
  def svg(): Vectorizer = js.native
  def tagName(): String = js.native
  def text(content: String): this.type = js.native
  def text(content: String, opt: TextOptions): this.type = js.native
  def toLocalPoint(x: Double, y: Double): SVGPoint = js.native
  def toggleClass(className: String): this.type = js.native
  def toggleClass(className: String, switchArg: Boolean): this.type = js.native
  def transform(): SVGMatrix = js.native
  def transform(matrix: Matrix): this.type = js.native
  def transform(matrix: Matrix, opt: TransformOptions): this.type = js.native
  def transform(matrix: SVGMatrix): this.type = js.native
  def transform(matrix: SVGMatrix, opt: TransformOptions): this.type = js.native
  def translate(): Translation = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: TransformOptions): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: Vectorizer): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: SVGElement): this.type = js.native
  def translateCenterToPoint(p: PlainPoint): this.type = js.native
}

