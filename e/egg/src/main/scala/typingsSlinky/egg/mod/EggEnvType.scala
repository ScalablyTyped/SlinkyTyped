package typingsSlinky.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.egg.eggStrings.local
  - typingsSlinky.egg.eggStrings.unittest
  - typingsSlinky.egg.eggStrings.prod
  - java.lang.String
*/
trait EggEnvType extends js.Object

object EggEnvType {
  @scala.inline
  def local: typingsSlinky.egg.eggStrings.local = "local".asInstanceOf[typingsSlinky.egg.eggStrings.local]
  @scala.inline
  def unittest: typingsSlinky.egg.eggStrings.unittest = "unittest".asInstanceOf[typingsSlinky.egg.eggStrings.unittest]
  @scala.inline
  def prod: typingsSlinky.egg.eggStrings.prod = "prod".asInstanceOf[typingsSlinky.egg.eggStrings.prod]
  @scala.inline
  implicit def apply(value: String): EggEnvType = value.asInstanceOf[EggEnvType]
}

