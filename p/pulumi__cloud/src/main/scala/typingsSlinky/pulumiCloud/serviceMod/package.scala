package typingsSlinky.pulumiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serviceMod {
  
  type Containers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pulumiCloud.serviceMod.Container]
  
  type Endpoints = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.NumberDictionary[typingsSlinky.pulumiCloud.serviceMod.Endpoint]
  ]
  
  @scala.inline
  def Service: typingsSlinky.pulumiCloud.serviceMod.ServiceConstructor = typingsSlinky.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].selectDynamic("Service").asInstanceOf[typingsSlinky.pulumiCloud.serviceMod.ServiceConstructor]
  @scala.inline
  def Service_=(x: typingsSlinky.pulumiCloud.serviceMod.ServiceConstructor): scala.Unit = typingsSlinky.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].updateDynamic("Service")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Task: typingsSlinky.pulumiCloud.serviceMod.TaskConstructor = typingsSlinky.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].selectDynamic("Task").asInstanceOf[typingsSlinky.pulumiCloud.serviceMod.TaskConstructor]
  @scala.inline
  def Task_=(x: typingsSlinky.pulumiCloud.serviceMod.TaskConstructor): scala.Unit = typingsSlinky.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].updateDynamic("Task")(x.asInstanceOf[js.Any])
}
