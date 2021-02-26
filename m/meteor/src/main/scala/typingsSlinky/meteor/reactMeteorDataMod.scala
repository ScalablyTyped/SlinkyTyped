package typingsSlinky.meteor

import slinky.core.ReactComponentClass
import typingsSlinky.meteor.anon.GetMeteorData
import typingsSlinky.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMeteorDataMod {
  
  @JSImport("meteor/react-meteor-data", "useTracker")
  @js.native
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps]): TDataProps = js.native
  @JSImport("meteor/react-meteor-data", "useTracker")
  @js.native
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps], deps: DependencyList): TDataProps = js.native
  
  @JSImport("meteor/react-meteor-data", "withTracker")
  @js.native
  def withTracker[TDataProps, TOwnProps](options: js.Function1[/* props */ TOwnProps, TDataProps | (GetMeteorData[TOwnProps, TDataProps])]): js.Function1[
    /* reactComponent */ ReactComponentClass[TOwnProps with TDataProps], 
    ReactComponentClass[TOwnProps]
  ] = js.native
}
