package typingsSlinky.meteor

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/react-meteor-data", JSImport.Namespace)
@js.native
object reactDashMeteorDashDataMod extends js.Object {
  def withTracker[TDataProps, TOwnProps](
    options: js.Function1[/* props */ TOwnProps, TDataProps | (Anon_GetMeteorData[TOwnProps, TDataProps])]
  ): js.Function1[
    /* reactComponent */ ReactComponentClass[TOwnProps with TDataProps], 
    ReactComponentClass[TOwnProps]
  ] = js.native
}

