package typingsSlinky.raphael.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.raphael.anon.PartialRaphaelAttributes
import typingsSlinky.raphael.anon.PartialRaphaelGlowSetting
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

/* Inlined {[ P in keyof raphael.raphael.RaphaelSet<TTechnology> ]: raphael.raphael.RaphaelSet<TTechnology>[P] extends (args : any): any? raphael.raphael.RaphaelSetPluginMethod<TTechnology, std.Parameters<raphael.raphael.RaphaelSet<TTechnology>[P]>, std.ReturnType<raphael.raphael.RaphaelSet<TTechnology>[P]>> : never} */
@js.native
trait RaphaelSetPluginRegistry[TTechnology /* <: RaphaelTechnology */] extends js.Object {
  var animate: RaphaelSetPluginMethod[
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
  var animateWith: RaphaelSetPluginMethod[
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
  var attr: RaphaelSetPluginMethod[
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
  var clear: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]] = js.native
  var click: RaphaelSetPluginMethod[
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
  var clone_FRaphaelSetPluginRegistry: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var data: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* key */ String, _]], 
    ReturnType[js.Function1[/* key */ String, _]]
  ] = js.native
  var dblclick: RaphaelSetPluginMethod[
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
  var drag: RaphaelSetPluginMethod[
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
  var exclude: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        Boolean
      ]
    ], 
    ReturnType[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        Boolean
      ]
    ]
  ] = js.native
  var forEach: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function2[
        /* callback */ js.ThisFunction1[
          /* this */ Window, 
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          Boolean | Unit
        ], 
        /* thisArg */ js.UndefOr[Window], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function2[
        /* callback */ js.ThisFunction1[
          /* this */ Window, 
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          Boolean | Unit
        ], 
        /* thisArg */ js.UndefOr[Window], 
        this.type
      ]
    ]
  ] = js.native
  var getBBox: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
    ], 
    ReturnType[
      js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
    ]
  ] = js.native
  var glow: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
    ], 
    ReturnType[
      js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
    ]
  ] = js.native
  var hide: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var hover: RaphaelSetPluginMethod[
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
  var insertAfter: RaphaelSetPluginMethod[
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
  var insertBefore: RaphaelSetPluginMethod[
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
  var length: RaphaelSetPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]] = js.native
  var matrix: RaphaelSetPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]] = js.native
  var mousedown: RaphaelSetPluginMethod[
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
  var mousemove: RaphaelSetPluginMethod[
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
  var mouseout: RaphaelSetPluginMethod[
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
  var mouseover: RaphaelSetPluginMethod[
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
  var mouseup: RaphaelSetPluginMethod[
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
  var onDragOver: RaphaelSetPluginMethod[
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
  var pause: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var pop: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function0[
        js.UndefOr[
          RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ]
        ]
      ]
    ], 
    ReturnType[
      js.Function0[
        js.UndefOr[
          RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  var push: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* repeated */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* repeated */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ]
  ] = js.native
  var remove: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]] = js.native
  var removeData: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* key */ js.UndefOr[String], this.type]], 
    ReturnType[js.Function1[/* key */ js.UndefOr[String], this.type]]
  ] = js.native
  var resume: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var rotate: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function3[/* degrees */ Double, /* centerX */ Double, /* centerY */ Double, this.type]
    ], 
    ReturnType[
      js.Function3[/* degrees */ Double, /* centerX */ Double, /* centerY */ Double, this.type]
    ]
  ] = js.native
  var scale: RaphaelSetPluginMethod[
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
  var setTime: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function2[/* animation */ RaphaelAnimation, /* value */ Double, this.type]], 
    ReturnType[js.Function2[/* animation */ RaphaelAnimation, /* value */ Double, this.type]]
  ] = js.native
  var show: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var splice: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[
      js.Function3[
        /* index */ Double, 
        /* count */ Double, 
        /* repeated */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        RaphaelSet[TTechnology]
      ]
    ], 
    ReturnType[
      js.Function3[
        /* index */ Double, 
        /* count */ Double, 
        /* repeated */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        RaphaelSet[TTechnology]
      ]
    ]
  ] = js.native
  var status: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
    ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
  ] = js.native
  var stop: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* animation */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* animation */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var toBack: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var toFront: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var touchcancel: RaphaelSetPluginMethod[
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
  var touchend: RaphaelSetPluginMethod[
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
  var touchmove: RaphaelSetPluginMethod[
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
  var touchstart: RaphaelSetPluginMethod[
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
  var transform: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]] = js.native
  var translate: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function2[/* deltaX */ Double, /* deltaY */ Double, this.type]], 
    ReturnType[js.Function2[/* deltaX */ Double, /* deltaY */ Double, this.type]]
  ] = js.native
  var unclick: RaphaelSetPluginMethod[
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
  var undblclick: RaphaelSetPluginMethod[
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
  var undrag: RaphaelSetPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var unhover: RaphaelSetPluginMethod[
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
  var unmousedown: RaphaelSetPluginMethod[
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
  var unmousemove: RaphaelSetPluginMethod[
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
  var unmouseout: RaphaelSetPluginMethod[
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
  var unmouseover: RaphaelSetPluginMethod[
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
  var unmouseup: RaphaelSetPluginMethod[
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
  var untouchcancel: RaphaelSetPluginMethod[
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
  var untouchend: RaphaelSetPluginMethod[
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
  var untouchmove: RaphaelSetPluginMethod[
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
  var untouchstart: RaphaelSetPluginMethod[
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

object RaphaelSetPluginRegistry {
  @scala.inline
  def apply[TTechnology](
    animate: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    animateWith: RaphaelSetPluginMethod[
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
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
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
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    attr: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
          /* attributeValue */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
          /* attributeValue */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    clear: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]],
    click: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    clone: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
    ],
    data: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function1[/* key */ String, _]], 
      ReturnType[js.Function1[/* key */ String, _]]
    ],
    dblclick: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    drag: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function6[
          /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function6[
          /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    exclude: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          Boolean
        ]
      ], 
      ReturnType[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          Boolean
        ]
      ]
    ],
    forEach: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* callback */ js.ThisFunction1[
            /* this */ Window, 
            /* element */ RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ], 
            Boolean | Unit
          ], 
          /* thisArg */ js.UndefOr[Window], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* callback */ js.ThisFunction1[
            /* this */ Window, 
            /* element */ RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ], 
            Boolean | Unit
          ], 
          /* thisArg */ js.UndefOr[Window], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    getBBox: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
      ], 
      ReturnType[
        js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
      ]
    ],
    glow: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
      ]
    ],
    hide: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
    ],
    hover: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* onHoverInHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* onHoverInHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    insertAfter: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    insertBefore: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    length: RaphaelSetPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]],
    matrix: RaphaelSetPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]],
    mousedown: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    mousemove: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseout: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseover: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseup: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    onDragOver: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* onDragOverHandler */ RaphaelDragOnOverHandler[
            TTechnology, 
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* onDragOverHandler */ RaphaelDragOnOverHandler[
            TTechnology, 
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    pause: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
      ]
    ],
    pop: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function0[
          js.UndefOr[
            RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]
          ]
        ]
      ], 
      ReturnType[
        js.Function0[
          js.UndefOr[
            RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]
          ]
        ]
      ]
    ],
    push: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* repeated */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* repeated */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    remove: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]],
    removeData: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* key */ js.UndefOr[String], RaphaelSetPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* key */ js.UndefOr[String], RaphaelSetPluginRegistry[TTechnology]]
      ]
    ],
    resume: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
      ]
    ],
    rotate: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function3[
          /* degrees */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function3[
          /* degrees */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    scale: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* scaleFactorX */ Double, 
          /* scaleFactorY */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* scaleFactorX */ Double, 
          /* scaleFactorY */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    setTime: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* animation */ RaphaelAnimation, 
          /* value */ Double, 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* animation */ RaphaelAnimation, 
          /* value */ Double, 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    show: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
    ],
    splice: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function3[
          /* index */ Double, 
          /* count */ Double, 
          /* repeated */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSet[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function3[
          /* index */ Double, 
          /* count */ Double, 
          /* repeated */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelSet[TTechnology]
        ]
      ]
    ],
    status: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
      ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
    ],
    stop: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* animation */ js.UndefOr[RaphaelAnimation], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* animation */ js.UndefOr[RaphaelAnimation], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    toBack: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
    ],
    toFront: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
    ],
    touchcancel: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchend: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchmove: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchstart: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    transform: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]],
    translate: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelSetPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelSetPluginRegistry[TTechnology]]
      ]
    ],
    unclick: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    undblclick: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    undrag: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
    ],
    unhover: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmousedown: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmousemove: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseout: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseover: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseup: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchcancel: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchend: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchmove: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchstart: RaphaelSetPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelSetPluginRegistry[TTechnology]
        ]
      ]
    ]
  ): RaphaelSetPluginRegistry[TTechnology] = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateWith = animateWith.asInstanceOf[js.Any], attr = attr.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], clone = clone.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], getBBox = getBBox.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], insertAfter = insertAfter.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeData = removeData.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setTime = setTime.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], splice = splice.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], toBack = toBack.asInstanceOf[js.Any], toFront = toFront.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], unclick = unclick.asInstanceOf[js.Any], undblclick = undblclick.asInstanceOf[js.Any], undrag = undrag.asInstanceOf[js.Any], unhover = unhover.asInstanceOf[js.Any], unmousedown = unmousedown.asInstanceOf[js.Any], unmousemove = unmousemove.asInstanceOf[js.Any], unmouseout = unmouseout.asInstanceOf[js.Any], unmouseover = unmouseover.asInstanceOf[js.Any], unmouseup = unmouseup.asInstanceOf[js.Any], untouchcancel = untouchcancel.asInstanceOf[js.Any], untouchend = untouchend.asInstanceOf[js.Any], untouchmove = untouchmove.asInstanceOf[js.Any], untouchstart = untouchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelSetPluginRegistry[TTechnology]]
  }
  @scala.inline
  implicit class RaphaelSetPluginRegistryOps[Self[ttechnology] <: RaphaelSetPluginRegistry[ttechnology], TTechnology] (val x: Self[TTechnology]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTechnology] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTechnology]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTechnology] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTechnology] with Other]
    @scala.inline
    def withAnimate(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
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
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
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
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | typingsSlinky.raphael.raphaelStrings.x | y, 
              /* attributeValue */ js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | typingsSlinky.raphael.raphaelStrings.x | y, 
              /* attributeValue */ js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(
      value: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(
      value: RaphaelSetPluginMethod[
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function6[
              /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function6[
              /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              Boolean
            ]
          ], 
          ReturnType[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              Boolean
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForEach(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* callback */ js.ThisFunction1[
                /* this */ Window, 
                /* element */ RaphaelElement[
                  TTechnology, 
                  /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
                ], 
                Boolean | Unit
              ], 
              /* thisArg */ js.UndefOr[Window], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* callback */ js.ThisFunction1[
                /* this */ Window, 
                /* element */ RaphaelElement[
                  TTechnology, 
                  /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
                ], 
                Boolean | Unit
              ], 
              /* thisArg */ js.UndefOr[Window], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBBox(
      value: RaphaelSetPluginMethod[
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
      value: RaphaelSetPluginMethod[
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHover(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* onHoverInHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* onHoverInHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertAfter(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: RaphaelSetPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]]): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: RaphaelSetPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]]): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousedown(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDragOver(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* onDragOverHandler */ RaphaelDragOnOverHandler[
                TTechnology, 
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* onDragOverHandler */ RaphaelDragOnOverHandler[
                TTechnology, 
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]]
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPop(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function0[
              js.UndefOr[
                RaphaelElement[
                  TTechnology, 
                  /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
                ]
              ]
            ]
          ], 
          ReturnType[
            js.Function0[
              js.UndefOr[
                RaphaelElement[
                  TTechnology, 
                  /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
                ]
              ]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* repeated */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* repeated */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(
      value: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveData(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* key */ js.UndefOr[String], RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* key */ js.UndefOr[String], RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function3[
              /* degrees */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function3[
              /* degrees */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* scaleFactorX */ Double, 
              /* scaleFactorY */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* scaleFactorX */ Double, 
              /* scaleFactorY */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* animation */ RaphaelAnimation, 
              /* value */ Double, 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* animation */ RaphaelAnimation, 
              /* value */ Double, 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplice(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function3[
              /* index */ Double, 
              /* count */ Double, 
              /* repeated */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSet[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function3[
              /* index */ Double, 
              /* count */ Double, 
              /* repeated */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelSet[TTechnology]
            ]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(
      value: RaphaelSetPluginMethod[
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* animation */ js.UndefOr[RaphaelAnimation], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* animation */ js.UndefOr[RaphaelAnimation], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToFront(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslate(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnclick(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self[TTechnology] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhover(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelSetPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelSetPluginRegistry[TTechnology]
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

