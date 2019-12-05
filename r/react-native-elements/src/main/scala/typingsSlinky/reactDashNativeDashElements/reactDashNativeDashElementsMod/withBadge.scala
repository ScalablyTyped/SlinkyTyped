package typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ReactNode
import typingsSlinky.reactDashNativeDashElements.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "withBadge")
@js.native
object withBadge extends js.Object {
  def apply(): js.Function1[
    /* WrappedComponent */ ReactComponentClass[js.Object], 
    ReactComponentClass[js.Object]
  ] = js.native
  def apply(/**
    * Text value to be displayed by badge
    */
  value: js.Function0[ReactNode]): js.Function1[
    /* WrappedComponent */ ReactComponentClass[js.Object], 
    ReactComponentClass[js.Object]
  ] = js.native
  def apply(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[ReactNode],
    /**
    * Options to configure the badge
    */
  options: Anon_Bottom with BadgeProps
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[js.Object], 
    ReactComponentClass[js.Object]
  ] = js.native
  def apply(/**
    * Text value to be displayed by badge
    */
  value: ReactNode): js.Function1[
    /* WrappedComponent */ ReactComponentClass[js.Object], 
    ReactComponentClass[js.Object]
  ] = js.native
  def apply(
    /**
    * Text value to be displayed by badge
    */
  value: ReactNode,
    /**
    * Options to configure the badge
    */
  options: Anon_Bottom with BadgeProps
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[js.Object], 
    ReactComponentClass[js.Object]
  ] = js.native
}

