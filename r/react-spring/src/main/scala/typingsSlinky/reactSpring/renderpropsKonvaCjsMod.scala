package typingsSlinky.reactSpring

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSpring.anon.FnCall
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
import typingsSlinky.reactSpring.renderpropsKonvaMod.KonvaComponents
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringConfig
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringProps
import typingsSlinky.reactSpring.renderpropsUniversalMod.TrailProps
import typingsSlinky.reactSpring.renderpropsUniversalMod.TransitionProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spring/renderprops-konva.cjs", JSImport.Namespace)
@js.native
object renderpropsKonvaCjsMod extends js.Object {
  
  val animated: FnCall with typingsSlinky.reactSpring.reactSpringStrings.animated with TopLevel[KonvaComponents] = js.native
  
  def interpolate(parent: js.Array[Double], config: js.Function1[/* repeated */ Double, _]): js.Any = js.native
  
  @js.native
  class Keyframes[S /* <: js.Object */, DS /* <: js.Object */] ()
    extends typingsSlinky.reactSpring.renderpropsKonvaMod.Keyframes[S, DS]
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
