package typingsSlinky.reactSpring

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringConfig
import typingsSlinky.reactSpring.renderpropsUniversalMod.TransitionKeyProps
import typingsSlinky.reactSpring.webMod.AnimatedValue
import typingsSlinky.reactSpring.webMod.ForwardedProps
import typingsSlinky.reactSpring.webMod.Merge
import typingsSlinky.reactSpring.webMod.OverwriteKeys
import typingsSlinky.reactSpring.webMod.ReactSpringHook
import typingsSlinky.reactSpring.webMod.SetUpdateCallbackFn
import typingsSlinky.reactSpring.webMod.SetUpdateFn
import typingsSlinky.reactSpring.webMod.UseSpringProps
import typingsSlinky.reactSpring.webMod.UseTransitionProps
import typingsSlinky.reactSpring.webMod.UseTransitionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spring/web.cjs", JSImport.Namespace)
@js.native
object webCjsMod extends js.Object {
  
  def animated[T /* <: ReactType[_] */](comp: T): ForwardRefExoticComponent[ComponentPropsWithRef[T]] = js.native
  
  def interpolate(parent: js.Array[Double], config: js.Function1[/* repeated */ Double, _]): js.Any = js.native
  
  def useChain(refs: js.Array[ReactRef[ReactSpringHook]]): Unit = js.native
  def useChain(refs: js.Array[ReactRef[ReactSpringHook]], timeSteps: js.Array[Double]): Unit = js.native
  def useChain(refs: js.Array[ReactRef[ReactSpringHook]], timeSteps: js.Array[Double], timeFrame: Double): Unit = js.native
  
  def useSpring[DS /* <: js.Object */](getProps: js.Function0[UseSpringProps[Merge[DS, CSSProperties]]]): js.Tuple2[
    AnimatedValue[ForwardedProps[OverwriteKeys[DS, CSSProperties]]], 
    SetUpdateFn[OverwriteKeys[DS, CSSProperties]]
  ] = js.native
  def useSpring[DS /* <: js.Object */](values: UseSpringProps[Merge[DS, CSSProperties]]): AnimatedValue[ForwardedProps[OverwriteKeys[DS, CSSProperties]]] = js.native
  
  def useSprings[DS /* <: js.Object */](count: Double, getProps: js.Function1[/* i */ Double, UseSpringProps[DS]]): js.Tuple2[js.Array[AnimatedValue[ForwardedProps[DS]]], SetUpdateCallbackFn[DS]] = js.native
  def useSprings[TItem, DS /* <: CSSProperties */](count: Double, items: js.Array[TItem]): js.Array[ForwardedProps[DS]] = js.native
  
  def useTrail[DS /* <: js.Object */](count: Double, getProps: js.Function0[UseSpringProps[DS]]): js.Tuple2[js.Array[AnimatedValue[ForwardedProps[DS]]], SetUpdateFn[DS]] = js.native
  def useTrail[DS /* <: js.Object */](count: Double, values: UseSpringProps[DS]): js.Array[AnimatedValue[ForwardedProps[DS]]] = js.native
  @JSName("useTrail")
  def useTrail_DS_CSSProperties[DS /* <: CSSProperties */](count: Double, getProps: js.Function0[UseSpringProps[DS with CSSProperties]]): js.Tuple2[js.Array[ForwardedProps[DS]], SetUpdateFn[DS]] = js.native
  @JSName("useTrail")
  def useTrail_DS_CSSProperties[DS /* <: CSSProperties */](count: Double, values: UseSpringProps[DS with CSSProperties]): js.Array[ForwardedProps[DS]] = js.native
  
  def useTransition[TItem, DS /* <: js.Object */](items: TItem, keys: js.Array[TransitionKeyProps], values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](
    items: TItem,
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: TItem, keys: Null, values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: TItem, keys: TransitionKeyProps, values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](
    items: js.UndefOr[scala.Nothing],
    keys: js.Array[TransitionKeyProps],
    values: Merge[DS, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](
    items: js.UndefOr[scala.Nothing],
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: js.UndefOr[scala.Nothing], keys: Null, values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](
    items: js.UndefOr[scala.Nothing],
    keys: TransitionKeyProps,
    values: Merge[DS, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](
    items: js.Array[TItem],
    keys: js.Array[TransitionKeyProps],
    values: Merge[DS, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](
    items: js.Array[TItem],
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: js.Array[TItem], keys: Null, values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: js.Array[TItem], keys: TransitionKeyProps, values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: Null, keys: js.Array[TransitionKeyProps], values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](
    items: Null,
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: Null, keys: Null, values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  def useTransition[TItem, DS /* <: js.Object */](items: Null, keys: TransitionKeyProps, values: Merge[DS, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, AnimatedValue[ForwardedProps[DS]]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: TItem,
    keys: js.Array[TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: TItem,
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](items: TItem, keys: Null, values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: TItem,
    keys: TransitionKeyProps,
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.UndefOr[scala.Nothing],
    keys: js.Array[TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.UndefOr[scala.Nothing],
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.UndefOr[scala.Nothing],
    keys: Null,
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.UndefOr[scala.Nothing],
    keys: TransitionKeyProps,
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.Array[TItem],
    keys: js.Array[TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.Array[TItem],
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.Array[TItem],
    keys: Null,
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: js.Array[TItem],
    keys: TransitionKeyProps,
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: Null,
    keys: js.Array[TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: Null,
    keys: js.Function1[/* item */ TItem, TransitionKeyProps],
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](items: Null, keys: Null, values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  @JSName("useTransition")
  def useTransition_TItemDS_CSSProperties[TItem, DS /* <: CSSProperties */](
    items: Null,
    keys: TransitionKeyProps,
    values: Merge[DS with CSSProperties, UseTransitionProps[TItem, DS]]
  ): js.Array[UseTransitionResult[TItem, ForwardedProps[DS]]] = js.native
  
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
