package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPersonalizeeventsMod {
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EventList = js.Array[Event]
  type EventPropertiesJSON = String
  type StringType = String
  type UserId = String
  type _Date = js.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-03-22`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
