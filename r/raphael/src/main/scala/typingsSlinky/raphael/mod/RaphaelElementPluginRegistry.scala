package typingsSlinky.raphael.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.raphael.anon.PartialRaphaelAttributes
import typingsSlinky.raphael.anon.PartialRaphaelGlowSetting
import typingsSlinky.raphael.raphaelStrings.SVG
import typingsSlinky.raphael.raphaelStrings.VML
import typingsSlinky.raphael.raphaelStrings.`arrow-end`
import typingsSlinky.raphael.raphaelStrings.`clip-rect`
import typingsSlinky.raphael.raphaelStrings.`fill-opacity`
import typingsSlinky.raphael.raphaelStrings.`font-family`
import typingsSlinky.raphael.raphaelStrings.`font-size`
import typingsSlinky.raphael.raphaelStrings.`font-weight`
import typingsSlinky.raphael.raphaelStrings.`stroke-dasharray`
import typingsSlinky.raphael.raphaelStrings.`stroke-linecap`
import typingsSlinky.raphael.raphaelStrings.`stroke-linejoin`
import typingsSlinky.raphael.raphaelStrings.`stroke-miterlimit`
import typingsSlinky.raphael.raphaelStrings.`stroke-opacity`
import typingsSlinky.raphael.raphaelStrings.`stroke-width`
import typingsSlinky.raphael.raphaelStrings.`text-anchor`
import typingsSlinky.raphael.raphaelStrings.cursor
import typingsSlinky.raphael.raphaelStrings.cx
import typingsSlinky.raphael.raphaelStrings.cy
import typingsSlinky.raphael.raphaelStrings.fill
import typingsSlinky.raphael.raphaelStrings.font
import typingsSlinky.raphael.raphaelStrings.height
import typingsSlinky.raphael.raphaelStrings.href
import typingsSlinky.raphael.raphaelStrings.opacity
import typingsSlinky.raphael.raphaelStrings.path
import typingsSlinky.raphael.raphaelStrings.r_
import typingsSlinky.raphael.raphaelStrings.rx
import typingsSlinky.raphael.raphaelStrings.ry
import typingsSlinky.raphael.raphaelStrings.src
import typingsSlinky.raphael.raphaelStrings.stroke
import typingsSlinky.raphael.raphaelStrings.target
import typingsSlinky.raphael.raphaelStrings.text
import typingsSlinky.raphael.raphaelStrings.title
import typingsSlinky.raphael.raphaelStrings.transform
import typingsSlinky.raphael.raphaelStrings.width
import typingsSlinky.raphael.raphaelStrings.x
import typingsSlinky.raphael.raphaelStrings.y
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]> ]: raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]>[P] extends (args : any): any? raphael.raphael.RaphaelElementPluginMethod<TTechnology, std.Parameters<raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]>[P]>, std.ReturnType<raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]>[P]>> : never} */
@js.native
trait RaphaelElementPluginRegistry[TTechnology /* <: RaphaelTechnology */] extends js.Object {
  var animate: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function4[
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function4[
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var animateWith: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function6[
        /* otherElement */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        /* otherAnimation */ RaphaelAnimation, 
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function6[
        /* otherElement */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        /* otherAnimation */ RaphaelAnimation, 
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var attr: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function2[
        /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
        /* attributeValue */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
        ], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function2[
        /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
        /* attributeValue */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
        ], 
        this.type
      ]
    ]
  ] = js.native
  var click: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  @JSName("clone")
  var clone_FRaphaelElementPluginRegistry: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var data: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* key */ String, _]], 
    ReturnType[js.Function1[/* key */ String, _]]
  ] = js.native
  var dblclick: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var drag: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function6[
        /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function6[
        /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var getBBox: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
    ], 
    ReturnType[
      js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
    ]
  ] = js.native
  var glow: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
    ], 
    ReturnType[
      js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
    ]
  ] = js.native
  var hide: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var hover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function4[
        /* onHoverInHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function4[
        /* onHoverInHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var id: RaphaelElementPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]] = js.native
  var insertAfter: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ]
  ] = js.native
  var insertBefore: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ]
  ] = js.native
  var matrix: RaphaelElementPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]] = js.native
  var mousedown: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mousemove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mouseout: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mouseover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mouseup: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var next: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      (RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]) | Null
    ], 
    ReturnType[
      (RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]) | Null
    ]
  ] = js.native
  var node: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ]
  ] = js.native
  var onDragOver: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* onDragOverHandler */ RaphaelDragOnOverHandler[TTechnology, RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* onDragOverHandler */ RaphaelDragOnOverHandler[TTechnology, RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var paper: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[RaphaelPaper[TTechnology]], 
    ReturnType[RaphaelPaper[TTechnology]]
  ] = js.native
  var pause: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var prev: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      (RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]) | Null
    ], 
    ReturnType[
      (RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]) | Null
    ]
  ] = js.native
  var raphael: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.UndefOr[RaphaelStatic[SVG | VML]]], 
    ReturnType[js.UndefOr[RaphaelStatic[SVG | VML]]]
  ] = js.native
  var remove: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]] = js.native
  var removeData: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* key */ js.UndefOr[String], this.type]], 
    ReturnType[js.Function1[/* key */ js.UndefOr[String], this.type]]
  ] = js.native
  var resume: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var rotate: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function3[/* degrees */ Double, /* centerX */ Double, /* centerY */ Double, this.type]
    ], 
    ReturnType[
      js.Function3[/* degrees */ Double, /* centerX */ Double, /* centerY */ Double, this.type]
    ]
  ] = js.native
  var scale: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function4[
        /* scaleFactorX */ Double, 
        /* scaleFactorY */ Double, 
        /* centerX */ Double, 
        /* centerY */ Double, 
        this.type
      ]
    ], 
    ReturnType[
      js.Function4[
        /* scaleFactorX */ Double, 
        /* scaleFactorY */ Double, 
        /* centerX */ Double, 
        /* centerY */ Double, 
        this.type
      ]
    ]
  ] = js.native
  var setTime: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function2[/* animation */ RaphaelAnimation, /* value */ Double, this.type]], 
    ReturnType[js.Function2[/* animation */ RaphaelAnimation, /* value */ Double, this.type]]
  ] = js.native
  var show: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var status: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
    ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
  ] = js.native
  var stop: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* animation */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* animation */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var toBack: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var toFront: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var touchcancel: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var touchend: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var touchmove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var touchstart: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var transform: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]] = js.native
  var translate: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function2[/* deltaX */ Double, /* deltaY */ Double, this.type]], 
    ReturnType[js.Function2[/* deltaX */ Double, /* deltaY */ Double, this.type]]
  ] = js.native
  var `type`: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[RaphaelShapeType | String], 
    ReturnType[RaphaelShapeType | String]
  ] = js.native
  var unclick: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var undblclick: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var undrag: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var unhover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function2[
        /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function2[
        /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmousedown: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmousemove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmouseout: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmouseover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmouseup: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchcancel: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchend: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchmove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchstart: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
}

object RaphaelElementPluginRegistry {
  @scala.inline
  def apply[TTechnology](
    animate: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    animateWith: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function6[
          /* otherElement */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          /* otherAnimation */ RaphaelAnimation, 
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function6[
          /* otherElement */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          /* otherAnimation */ RaphaelAnimation, 
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    attr: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
          /* attributeValue */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
          /* attributeValue */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    click: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    clone: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    data: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function1[/* key */ String, _]], 
      ReturnType[js.Function1[/* key */ String, _]]
    ],
    dblclick: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    drag: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function6[
          /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function6[
          /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    getBBox: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
      ], 
      ReturnType[
        js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
      ]
    ],
    glow: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
      ]
    ],
    hide: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    hover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* onHoverInHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* onHoverInHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    id: RaphaelElementPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]],
    insertAfter: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    insertBefore: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    matrix: RaphaelElementPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]],
    mousedown: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mousemove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseout: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseup: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    next: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ], 
      ReturnType[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ]
    ],
    node: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]
    ],
    onDragOver: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* onDragOverHandler */ RaphaelDragOnOverHandler[
            TTechnology, 
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* onDragOverHandler */ RaphaelDragOnOverHandler[
            TTechnology, 
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    paper: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[RaphaelPaper[TTechnology]], 
      ReturnType[RaphaelPaper[TTechnology]]
    ],
    pause: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    prev: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ], 
      ReturnType[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ]
    ],
    raphael: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.UndefOr[RaphaelStatic[SVG | VML]]], 
      ReturnType[js.UndefOr[RaphaelStatic[SVG | VML]]]
    ],
    remove: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]],
    removeData: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    resume: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    rotate: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function3[
          /* degrees */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function3[
          /* degrees */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    scale: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* scaleFactorX */ Double, 
          /* scaleFactorY */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* scaleFactorX */ Double, 
          /* scaleFactorY */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    setTime: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* animation */ RaphaelAnimation, 
          /* value */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* animation */ RaphaelAnimation, 
          /* value */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    show: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    status: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
      ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
    ],
    stop: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* animation */ js.UndefOr[RaphaelAnimation], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* animation */ js.UndefOr[RaphaelAnimation], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    toBack: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    toFront: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    touchcancel: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchend: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchmove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchstart: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    transform: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]],
    translate: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    `type`: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[RaphaelShapeType | String], 
      ReturnType[RaphaelShapeType | String]
    ],
    unclick: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    undblclick: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    undrag: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    unhover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmousedown: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmousemove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseout: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseup: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchcancel: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchend: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchmove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchstart: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ]
  ): RaphaelElementPluginRegistry[TTechnology] = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateWith = animateWith.asInstanceOf[js.Any], attr = attr.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], clone = clone.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], getBBox = getBBox.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertAfter = insertAfter.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], raphael = raphael.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeData = removeData.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setTime = setTime.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], toBack = toBack.asInstanceOf[js.Any], toFront = toFront.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], unclick = unclick.asInstanceOf[js.Any], undblclick = undblclick.asInstanceOf[js.Any], undrag = undrag.asInstanceOf[js.Any], unhover = unhover.asInstanceOf[js.Any], unmousedown = unmousedown.asInstanceOf[js.Any], unmousemove = unmousemove.asInstanceOf[js.Any], unmouseout = unmouseout.asInstanceOf[js.Any], unmouseover = unmouseover.asInstanceOf[js.Any], unmouseup = unmouseup.asInstanceOf[js.Any], untouchcancel = untouchcancel.asInstanceOf[js.Any], untouchend = untouchend.asInstanceOf[js.Any], untouchmove = untouchmove.asInstanceOf[js.Any], untouchstart = untouchstart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementPluginRegistry[TTechnology]]
  }
  @scala.inline
  implicit class RaphaelElementPluginRegistryOps[Self[ttechnology] <: RaphaelElementPluginRegistry[ttechnology], TTechnology] (val x: Self[TTechnology]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTechnology] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTechnology]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTechnology] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTechnology] with Other]
    @scala.inline
    def withAnimate(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateWith(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function6[
              /* otherElement */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              /* otherAnimation */ RaphaelAnimation, 
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function6[
              /* otherElement */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              /* otherAnimation */ RaphaelAnimation, 
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttr(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | typingsSlinky.raphael.raphaelStrings.x | y, 
              /* attributeValue */ js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | typingsSlinky.raphael.raphaelStrings.x | y, 
              /* attributeValue */ js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function1[/* key */ String, _]], 
          ReturnType[js.Function1[/* key */ String, _]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrag(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function6[
              /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function6[
              /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBBox(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
          ], 
          ReturnType[
            js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlow(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* onHoverInHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* onHoverInHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: RaphaelElementPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]]): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertAfter(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertBefore(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(
      value: RaphaelElementPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousedown(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousemove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseout(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseup(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ], 
          ReturnType[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDragOver(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* onDragOverHandler */ RaphaelDragOnOverHandler[
                TTechnology, 
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* onDragOverHandler */ RaphaelDragOnOverHandler[
                TTechnology, 
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaper(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[RaphaelPaper[TTechnology]], 
          ReturnType[RaphaelPaper[TTechnology]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ], 
          ReturnType[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaphael(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.UndefOr[RaphaelStatic[SVG | VML]]], 
          ReturnType[js.UndefOr[RaphaelStatic[SVG | VML]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raphael")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(
      value: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveData(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function3[
              /* degrees */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function3[
              /* degrees */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* scaleFactorX */ Double, 
              /* scaleFactorY */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* scaleFactorX */ Double, 
              /* scaleFactorY */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTime(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* animation */ RaphaelAnimation, 
              /* value */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* animation */ RaphaelAnimation, 
              /* value */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
          ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* animation */ js.UndefOr[RaphaelAnimation], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* animation */ js.UndefOr[RaphaelAnimation], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToBack(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToFront(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(
      value: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslate(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[RaphaelShapeType | String], 
          ReturnType[RaphaelShapeType | String]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnclick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndblclick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndrag(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmousedown(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmousemove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmouseout(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmouseover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmouseup(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntouchcancel(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untouchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntouchend(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untouchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntouchmove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untouchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntouchstart(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untouchstart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

