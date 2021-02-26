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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof raphael.raphael.RaphaelSet<TTechnology> ]: raphael.raphael.RaphaelSet<TTechnology>[P] extends (args : any): any? raphael.raphael.RaphaelSetPluginMethod<TTechnology, std.Parameters<raphael.raphael.RaphaelSet<TTechnology>[P]>, std.ReturnType<raphael.raphael.RaphaelSet<TTechnology>[P]>> : never} */
@js.native
trait RaphaelSetPluginRegistry[TTechnology /* <: RaphaelTechnology */] extends StObject {
  
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
  def apply[TTechnology /* <: RaphaelTechnology */](
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
    clone_ : RaphaelSetPluginMethod[
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
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateWith = animateWith.asInstanceOf[js.Any], attr = attr.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], getBBox = getBBox.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], insertAfter = insertAfter.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeData = removeData.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setTime = setTime.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], splice = splice.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], toBack = toBack.asInstanceOf[js.Any], toFront = toFront.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], unclick = unclick.asInstanceOf[js.Any], undblclick = undblclick.asInstanceOf[js.Any], undrag = undrag.asInstanceOf[js.Any], unhover = unhover.asInstanceOf[js.Any], unmousedown = unmousedown.asInstanceOf[js.Any], unmousemove = unmousemove.asInstanceOf[js.Any], unmouseout = unmouseout.asInstanceOf[js.Any], unmouseover = unmouseover.asInstanceOf[js.Any], unmouseup = unmouseup.asInstanceOf[js.Any], untouchcancel = untouchcancel.asInstanceOf[js.Any], untouchend = untouchend.asInstanceOf[js.Any], untouchmove = untouchmove.asInstanceOf[js.Any], untouchstart = untouchstart.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelSetPluginRegistry[TTechnology]]
  }
  
  @scala.inline
  implicit class RaphaelSetPluginRegistryMutableBuilder[Self <: RaphaelSetPluginRegistry[_], TTechnology /* <: RaphaelTechnology */] (val x: Self with RaphaelSetPluginRegistry[TTechnology]) extends AnyVal {
    
    @scala.inline
    def setAnimate(
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
    ): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateWith(
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
    ): Self = StObject.set(x, "animateWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttr(
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
    ): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(
      value: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]]
    ): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(
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
    ): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function1[/* key */ String, _]], 
          ReturnType[js.Function1[/* key */ String, _]]
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(
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
    ): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag(
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
    ): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(
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
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForEach(
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
    ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBBox(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
          ], 
          ReturnType[
            js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
          ]
        ]
    ): Self = StObject.set(x, "getBBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlow(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
          ]
        ]
    ): Self = StObject.set(x, "glow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHover(
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
    ): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAfter(
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
    ): Self = StObject.set(x, "insertAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBefore(
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
    ): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: RaphaelSetPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: RaphaelSetPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousedown(
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
    ): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousemove(
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
    ): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseout(
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
    ): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseover(
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
    ): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseup(
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
    ): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragOver(
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
    ): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPop(
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
    ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(
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
    ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(
      value: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]]
    ): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveData(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* key */ js.UndefOr[String], RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* key */ js.UndefOr[String], RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = StObject.set(x, "removeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(
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
    ): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(
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
    ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTime(
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
    ): Self = StObject.set(x, "setTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplice(
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
    ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
          ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
        ]
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(
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
    ): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBack(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self = StObject.set(x, "toBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFront(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self = StObject.set(x, "toFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(
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
    ): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(
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
    ): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(
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
    ): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(
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
    ): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(
      value: RaphaelSetPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]]
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslate(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelSetPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelSetPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclick(
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
    ): Self = StObject.set(x, "unclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndblclick(
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
    ): Self = StObject.set(x, "undblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndrag(
      value: RaphaelSetPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelSetPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelSetPluginRegistry[TTechnology]]]
        ]
    ): Self = StObject.set(x, "undrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhover(
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
    ): Self = StObject.set(x, "unhover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmousedown(
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
    ): Self = StObject.set(x, "unmousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmousemove(
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
    ): Self = StObject.set(x, "unmousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmouseout(
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
    ): Self = StObject.set(x, "unmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmouseover(
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
    ): Self = StObject.set(x, "unmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmouseup(
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
    ): Self = StObject.set(x, "unmouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntouchcancel(
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
    ): Self = StObject.set(x, "untouchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntouchend(
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
    ): Self = StObject.set(x, "untouchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntouchmove(
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
    ): Self = StObject.set(x, "untouchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntouchstart(
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
    ): Self = StObject.set(x, "untouchstart", value.asInstanceOf[js.Any])
  }
}
