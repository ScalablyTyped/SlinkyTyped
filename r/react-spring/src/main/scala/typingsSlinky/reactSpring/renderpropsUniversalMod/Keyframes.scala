package typingsSlinky.reactSpring.renderpropsUniversalMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSpring.reactSpringStrings.after
import typingsSlinky.reactSpring.reactSpringStrings.children
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
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spring/renderprops-universal", "Keyframes")
@js.native
class Keyframes[S /* <: js.Object */, DS /* <: js.Object */] ()
  extends Component[KeyframesProps[DS] with S, js.Object, js.Any]

/* static members */
@JSImport("react-spring/renderprops-universal", "Keyframes")
@js.native
object Keyframes extends js.Object {
  def Spring[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
    /* props */ js.Object, 
    Keyframes[
      S | (Pick[
        SpringProps[DS], 
        Exclude[
          /* keyof react-spring.react-spring/renderprops-universal.SpringProps<DS> */ from | to | onRest | onFrame | children | inject | after | force | typingsSlinky.reactSpring.reactSpringStrings.config | native | reset | immediate | delay | reverse | onStart, 
          to
        ]
      ]), 
      DS
    ]
  ] = js.native
  def Trail[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
    /* props */ js.Object, 
    Keyframes[
      S | (Pick[
        TrailProps[DS, js.Object], 
        Exclude[
          /* keyof react-spring.react-spring/renderprops-universal.TrailProps<DS, {}> */ from | to | items | keys | children | onRest | onFrame | inject | after | force | typingsSlinky.reactSpring.reactSpringStrings.config | native | reset | immediate | delay | reverse | onStart, 
          to
        ]
      ]), 
      DS
    ]
  ] = js.native
  def Transition[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
    /* props */ js.Object, 
    Keyframes[
      S | (Pick[
        TransitionProps[S, DS, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object], 
        Exclude[
          /* keyof react-spring.react-spring/renderprops-universal.TransitionProps<DS, {}, {}, {}, {}, {}, {}, {}> */ typingsSlinky.reactSpring.reactSpringStrings.config | initial | from | enter | leave | onRest | update | keys | items | children | onDestroyed | reset | trail | unique | native | reverse | onStart | immediate | delay, 
          to
        ]
      ]), 
      DS
    ]
  ] = js.native
  def create[S /* <: js.Object */, DS /* <: js.Object */](primitive: ReactComponentClass[js.Object]): js.Function1[/* states */ js.Object, js.Function1[/* props */ js.Object, Keyframes[S, DS]]] = js.native
}

