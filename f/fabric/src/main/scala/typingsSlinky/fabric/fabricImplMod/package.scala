package typingsSlinky.fabric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fabricImplMod {
  
  type IGradientOptionsColorStops = js.Array[typingsSlinky.fabric.anon.Color]
  
  type ITriangleOptions = typingsSlinky.fabric.fabricImplMod.IObjectOptions
  
  type IUtilAminEaseFunction = js.Function4[
    /* t */ scala.Double, 
    /* b */ scala.Double, 
    /* c */ scala.Double, 
    /* d */ scala.Double, 
    scala.Double
  ]
  
  type Resources = org.scalablytyped.runtime.StringDictionary[org.scalajs.dom.raw.HTMLCanvasElement]
  
  @scala.inline
  def copiedText: java.lang.String = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("copiedText").asInstanceOf[java.lang.String]
  
  @scala.inline
  def copiedTextStyle: js.Array[js.Any] = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("copiedTextStyle").asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def copiedTextStyle_=(x: js.Array[js.Any]): scala.Unit = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("copiedTextStyle")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def copiedText_=(x: java.lang.String): scala.Unit = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("copiedText")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def createCanvasForNode(width: scala.Double, height: scala.Double): typingsSlinky.fabric.fabricImplMod.Canvas = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasForNode")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fabric.fabricImplMod.Canvas]
  
  @scala.inline
  def createSVGFontFacesMarkup(objects: js.Array[typingsSlinky.fabric.fabricImplMod.Object]): java.lang.String = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSVGFontFacesMarkup")(objects.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def createSVGRefElementsMarkup(canvas: typingsSlinky.fabric.fabricImplMod.StaticCanvas): java.lang.String = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSVGRefElementsMarkup")(canvas.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def filterBackend: js.UndefOr[typingsSlinky.fabric.fabricImplMod.FilterBackend_] = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("filterBackend").asInstanceOf[js.UndefOr[typingsSlinky.fabric.fabricImplMod.FilterBackend_]]
  @scala.inline
  def filterBackend_=(x: js.UndefOr[typingsSlinky.fabric.fabricImplMod.FilterBackend_]): scala.Unit = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("filterBackend")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getCSSRules(doc: org.scalajs.dom.raw.SVGElement): js.Any = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCSSRules")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getGradientDefs(doc: org.scalajs.dom.raw.SVGElement): org.scalablytyped.runtime.StringDictionary[js.Any] = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGradientDefs")(doc.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.Any]]
  
  @scala.inline
  def iMatrix: js.Array[scala.Double] = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("iMatrix").asInstanceOf[js.Array[scala.Double]]
  
  @scala.inline
  def isLikelyNode: scala.Boolean = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("isLikelyNode").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTouchSupported: scala.Boolean = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("isTouchSupported").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def loadSVGFromString(
    string: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loadSVGFromString(
    string: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.Function
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.UndefOr[scala.Nothing],
    options: typingsSlinky.fabric.anon.CrossOrigin
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.Function
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.Function,
    options: typingsSlinky.fabric.anon.CrossOrigin
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def log(values: js.Any*): scala.Unit = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("log")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def parseAttributes(element: org.scalajs.dom.raw.HTMLElement, attributes: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  @scala.inline
  def parseAttributes(
    element: org.scalajs.dom.raw.HTMLElement,
    attributes: js.Array[java.lang.String],
    svgUid: java.lang.String
  ): org.scalablytyped.runtime.StringDictionary[java.lang.String] = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], svgUid.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  
  @scala.inline
  def parseElements(elements: js.Array[org.scalajs.dom.raw.SVGElement], callback: js.Function): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def parseElements(
    elements: js.Array[org.scalajs.dom.raw.SVGElement],
    callback: js.Function,
    options: js.UndefOr[scala.Nothing],
    reviver: js.Function
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def parseElements(elements: js.Array[_ | org.scalajs.dom.raw.SVGElement], callback: js.Function, options: js.Any): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def parseElements(
    elements: js.Array[_ | org.scalajs.dom.raw.SVGElement],
    callback: js.Function,
    options: js.Any,
    reviver: js.Function
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def parseFontDeclaration(value: java.lang.String, oStyle: js.Any): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFontDeclaration")(value.asInstanceOf[js.Any], oStyle.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def parsePointsAttribute(points: java.lang.String): js.Array[_] = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parsePointsAttribute")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def parseSVGDocument(
    doc: org.scalajs.dom.raw.SVGElement,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def parseSVGDocument(
    doc: org.scalajs.dom.raw.SVGElement,
    callback: js.Function2[
      /* results */ js.Array[typingsSlinky.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.Function
  ): scala.Unit = (typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def parseStyleAttribute(element: org.scalajs.dom.raw.SVGElement): js.Any = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseStyleAttribute")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def parseTransformAttribute(attributeValue: java.lang.String): js.Array[scala.Double] = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformAttribute")(attributeValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[scala.Double]]
  
  @scala.inline
  def textureSize: scala.Double = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("textureSize").asInstanceOf[scala.Double]
  @scala.inline
  def textureSize_=(x: scala.Double): scala.Unit = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("textureSize")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def util: typingsSlinky.fabric.fabricImplMod.IUtil = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("util").asInstanceOf[typingsSlinky.fabric.fabricImplMod.IUtil]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  
  @scala.inline
  def warn(values: js.Any*): scala.Unit = typingsSlinky.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
