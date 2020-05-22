package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.updateManagerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "UpdateManager")
@js.native
/**
  * @param  store - The quadstore to store data and metadata. Created if not passed.
  */
class UpdateManager () extends default {
  def this(store: typingsSlinky.rdflib.storeMod.default) = this()
}

