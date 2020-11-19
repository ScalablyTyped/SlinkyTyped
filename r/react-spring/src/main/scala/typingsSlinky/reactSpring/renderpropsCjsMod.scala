package typingsSlinky.reactSpring

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactSpring.reactSpringStrings.after
import typingsSlinky.reactSpring.reactSpringStrings.children
import typingsSlinky.reactSpring.reactSpringStrings.config
import typingsSlinky.reactSpring.reactSpringStrings.delay
import typingsSlinky.reactSpring.reactSpringStrings.enter
import typingsSlinky.reactSpring.reactSpringStrings.force
import typingsSlinky.reactSpring.reactSpringStrings.from
import typingsSlinky.reactSpring.reactSpringStrings.immediate
import typingsSlinky.reactSpring.reactSpringStrings.initial
import typingsSlinky.reactSpring.reactSpringStrings.inject
import typingsSlinky.reactSpring.reactSpringStrings.items
import typingsSlinky.reactSpring.reactSpringStrings.keys
import typingsSlinky.reactSpring.reactSpringStrings.leave
import typingsSlinky.reactSpring.reactSpringStrings.native
import typingsSlinky.reactSpring.reactSpringStrings.onDestroyed
import typingsSlinky.reactSpring.reactSpringStrings.onFrame
import typingsSlinky.reactSpring.reactSpringStrings.onRest
import typingsSlinky.reactSpring.reactSpringStrings.onStart
import typingsSlinky.reactSpring.reactSpringStrings.reset
import typingsSlinky.reactSpring.reactSpringStrings.reverse
import typingsSlinky.reactSpring.reactSpringStrings.to
import typingsSlinky.reactSpring.reactSpringStrings.trail
import typingsSlinky.reactSpring.reactSpringStrings.unique
import typingsSlinky.reactSpring.reactSpringStrings.update
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringConfig
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringProps
import typingsSlinky.reactSpring.renderpropsUniversalMod.TrailProps
import typingsSlinky.reactSpring.renderpropsUniversalMod.TransitionProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spring/renderprops.cjs", JSImport.Namespace)
@js.native
object renderpropsCjsMod extends js.Object {
  
  def interpolate(parent: js.Array[Double], config: js.Function1[/* repeated */ Double, _]): js.Any = js.native
  
  @js.native
  class Keyframes[S /* <: js.Object */, DS /* <: js.Object */] ()
    extends typingsSlinky.reactSpring.renderpropsMod.Keyframes[S, DS]
  /* static members */
  @js.native
  object Keyframes extends js.Object {
    
    def Spring[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typingsSlinky.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            SpringProps[DS], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.SpringProps<DS> */ from | to | onRest | onFrame | children | inject | after | force | config | native | reset | immediate | delay | reverse | onStart, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    
    def Trail[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typingsSlinky.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            TrailProps[DS, js.Object], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.TrailProps<DS, {}> */ from | to | items | keys | children | onRest | onFrame | inject | after | force | config | native | reset | immediate | delay | reverse | onStart, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    
    def Transition[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typingsSlinky.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            TransitionProps[S, DS, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.TransitionProps<DS, {}, {}, {}, {}, {}, {}, {}> */ config | initial | from | enter | leave | onRest | update | keys | items | children | onDestroyed | reset | trail | unique | native | reverse | onStart | immediate | delay, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    
    def create[S /* <: js.Object */, DS /* <: js.Object */](primitive: ReactComponentClass[js.Object]): js.Function1[
        /* states */ js.Object, 
        js.Function1[
          /* props */ js.Object, 
          typingsSlinky.reactSpring.renderpropsUniversalMod.Keyframes[S, DS]
        ]
      ] = js.native
  }
  
  @js.native
  class Spring[DS /* <: js.Object */] ()
    extends Component[SpringProps[DS], js.Object, js.Any]
  
  @js.native
  class Trail[TItem, DS /* <: js.Object */] ()
    extends Component[TrailProps[TItem, DS], js.Object, js.Any]
  
  @js.native
  class Transition[TItem, TInit /* <: js.Object */, TFrom /* <: js.Object */, TEnter /* <: js.Object */, TLeave /* <: js.Object */, TUpdate /* <: js.Object */] ()
    extends Component[
          TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, js.Object, js.Object], 
          js.Object, 
          js.Any
        ]
  
  @js.native
  object animated extends js.Object {
    
    def apply[T /* <: ReactType[_] */](comp: T): ForwardRefExoticComponent[ComponentPropsWithRef[T]] = js.native
    
    var a: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.a]] = js.native
    
    var abbr: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.abbr]] = js.native
    
    var address: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.address]] = js.native
    
    var animate: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.animate]] = js.native
    
    var animateMotion: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.animateMotion]
      ] = js.native
    
    var animateTransform: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.animateTransform]
      ] = js.native
    
    var area: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.area]] = js.native
    
    var article: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.article]] = js.native
    
    var aside: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.aside]] = js.native
    
    var audio: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.audio]] = js.native
    
    var b: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.b]] = js.native
    
    var base: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.base]] = js.native
    
    var bdi: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.bdi]] = js.native
    
    var bdo: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.bdo]] = js.native
    
    var big: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.big]] = js.native
    
    var blockquote: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.blockquote]] = js.native
    
    var body: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.body]] = js.native
    
    var br: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.br]] = js.native
    
    var button: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.button]] = js.native
    
    var canvas: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.canvas]] = js.native
    
    var caption: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.caption]] = js.native
    
    var circle: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.circle]] = js.native
    
    var cite: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.cite]] = js.native
    
    var clipPath: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.clipPath]] = js.native
    
    var code: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.code]] = js.native
    
    var col: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.col]] = js.native
    
    var colgroup: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.colgroup]] = js.native
    
    var data: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.data]] = js.native
    
    var datalist: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.datalist]] = js.native
    
    var dd: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.dd]] = js.native
    
    var defs: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.defs]] = js.native
    
    var del: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.del]] = js.native
    
    var desc: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.desc]] = js.native
    
    var details: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.details]] = js.native
    
    var dfn: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.dfn]] = js.native
    
    var dialog: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.dialog]] = js.native
    
    var div: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.div]] = js.native
    
    var dl: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.dl]] = js.native
    
    var dt: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.dt]] = js.native
    
    var ellipse: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.ellipse]] = js.native
    
    var em: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.em]] = js.native
    
    var embed: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.embed]] = js.native
    
    var feBlend: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feBlend]] = js.native
    
    var feColorMatrix: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feColorMatrix]
      ] = js.native
    
    var feComponentTransfer: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feComponentTransfer]
      ] = js.native
    
    var feComposite: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feComposite]] = js.native
    
    var feConvolveMatrix: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feConvolveMatrix]
      ] = js.native
    
    var feDiffuseLighting: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feDiffuseLighting]
      ] = js.native
    
    var feDisplacementMap: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feDisplacementMap]
      ] = js.native
    
    var feDistantLight: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feDistantLight]
      ] = js.native
    
    var feDropShadow: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feDropShadow]] = js.native
    
    var feFlood: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feFlood]] = js.native
    
    var feFuncA: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feFuncA]] = js.native
    
    var feFuncB: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feFuncB]] = js.native
    
    var feFuncG: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feFuncG]] = js.native
    
    var feFuncR: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feFuncR]] = js.native
    
    var feGaussianBlur: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feGaussianBlur]
      ] = js.native
    
    var feImage: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feImage]] = js.native
    
    var feMerge: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feMerge]] = js.native
    
    var feMergeNode: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feMergeNode]] = js.native
    
    var feMorphology: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feMorphology]] = js.native
    
    var feOffset: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feOffset]] = js.native
    
    var fePointLight: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.fePointLight]] = js.native
    
    var feSpecularLighting: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feSpecularLighting]
      ] = js.native
    
    var feSpotLight: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feSpotLight]] = js.native
    
    var feTile: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feTile]] = js.native
    
    var feTurbulence: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.feTurbulence]] = js.native
    
    var fieldset: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.fieldset]] = js.native
    
    var figcaption: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.figcaption]] = js.native
    
    var figure: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.figure]] = js.native
    
    var filter: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.filter]] = js.native
    
    var footer: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.footer]] = js.native
    
    var foreignObject: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.foreignObject]
      ] = js.native
    
    var form: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.form]] = js.native
    
    var g: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.g]] = js.native
    
    var h1: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.h1]] = js.native
    
    var h2: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.h2]] = js.native
    
    var h3: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.h3]] = js.native
    
    var h4: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.h4]] = js.native
    
    var h5: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.h5]] = js.native
    
    var h6: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.h6]] = js.native
    
    var head: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.head]] = js.native
    
    var header: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.header]] = js.native
    
    var hgroup: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.hgroup]] = js.native
    
    var hr: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.hr]] = js.native
    
    var html: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.html]] = js.native
    
    var i: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.i]] = js.native
    
    var iframe: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.iframe]] = js.native
    
    var image: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.image]] = js.native
    
    var img: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.img]] = js.native
    
    var input: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.input]] = js.native
    
    var ins: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.ins]] = js.native
    
    var kbd: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.kbd]] = js.native
    
    var keygen: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.keygen]] = js.native
    
    var label: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.label]] = js.native
    
    var legend: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.legend]] = js.native
    
    var li: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.li]] = js.native
    
    var line: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.line]] = js.native
    
    var linearGradient: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.linearGradient]
      ] = js.native
    
    var link: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.link]] = js.native
    
    var main: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.main]] = js.native
    
    var map: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.map]] = js.native
    
    var mark: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.mark]] = js.native
    
    var marker: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.marker]] = js.native
    
    var mask: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.mask]] = js.native
    
    var menu: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.menu]] = js.native
    
    var menuitem: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.menuitem]] = js.native
    
    var meta: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.meta]] = js.native
    
    var metadata: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.metadata]] = js.native
    
    var meter: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.meter]] = js.native
    
    var mpath: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.mpath]] = js.native
    
    var nav: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.nav]] = js.native
    
    var noindex: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.noindex]] = js.native
    
    var noscript: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.noscript]] = js.native
    
    var `object`: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.`object`]] = js.native
    
    var ol: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.ol]] = js.native
    
    var optgroup: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.optgroup]] = js.native
    
    var option: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.option]] = js.native
    
    var output: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.output]] = js.native
    
    var p: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.p]] = js.native
    
    var param: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.param]] = js.native
    
    var path: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.path]] = js.native
    
    var pattern: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.pattern]] = js.native
    
    var picture: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.picture]] = js.native
    
    var polygon: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.polygon]] = js.native
    
    var polyline: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.polyline]] = js.native
    
    var pre: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.pre]] = js.native
    
    var progress: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.progress]] = js.native
    
    var q: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.q]] = js.native
    
    var radialGradient: ForwardRefExoticComponent[
        ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.radialGradient]
      ] = js.native
    
    var rect: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.rect]] = js.native
    
    var rp: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.rp]] = js.native
    
    var rt: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.rt]] = js.native
    
    var ruby: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.ruby]] = js.native
    
    var s: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.s]] = js.native
    
    var samp: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.samp]] = js.native
    
    var script: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.script]] = js.native
    
    var section: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.section]] = js.native
    
    var select: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.select]] = js.native
    
    var slot: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.slot]] = js.native
    
    var small: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.small]] = js.native
    
    var source: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.source]] = js.native
    
    var span: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.span]] = js.native
    
    var stop: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.stop]] = js.native
    
    var strong: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.strong]] = js.native
    
    var style: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.style]] = js.native
    
    var sub: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.sub]] = js.native
    
    var summary: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.summary]] = js.native
    
    var sup: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.sup]] = js.native
    
    var svg: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.svg]] = js.native
    
    var switch: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.switch]] = js.native
    
    var symbol: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.symbol]] = js.native
    
    var table: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.table]] = js.native
    
    var tbody: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.tbody]] = js.native
    
    var td: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.td]] = js.native
    
    var template: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.template]] = js.native
    
    var text: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.text]] = js.native
    
    var textPath: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.textPath]] = js.native
    
    var textarea: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.textarea]] = js.native
    
    var tfoot: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.tfoot]] = js.native
    
    var th: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.th]] = js.native
    
    var thead: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.thead]] = js.native
    
    var time: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.time]] = js.native
    
    var title: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.title]] = js.native
    
    var tr: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.tr]] = js.native
    
    var track: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.track]] = js.native
    
    var tspan: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.tspan]] = js.native
    
    var u: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.u]] = js.native
    
    var ul: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.ul]] = js.native
    
    var use: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.use]] = js.native
    
    var `var`: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.`var`]] = js.native
    
    var video: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.video]] = js.native
    
    var view: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.view]] = js.native
    
    var wbr: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.wbr]] = js.native
    
    var webview: ForwardRefExoticComponent[ComponentPropsWithRef[typingsSlinky.reactSpring.reactSpringStrings.webview]] = js.native
  }
  
  @js.native
  object config extends js.Object {
    
    /** default: { tension: 170, friction: 26 } */
    var default: SpringConfig = js.native
    
    /** gentle: { tension: 120, friction: 14 } */
    var gentle: SpringConfig = js.native
    
    /** molasses: { tension: 280, friction: 120 } */
    var molasses: SpringConfig = js.native
    
    /** slow: { tension: 280, friction: 60 } */
    var slow: SpringConfig = js.native
    
    /** stiff: { tension: 210, friction: 20 } */
    var stiff: SpringConfig = js.native
    
    /** wobbly: { tension: 180, friction: 12 } */
    var wobbly: SpringConfig = js.native
  }
}
