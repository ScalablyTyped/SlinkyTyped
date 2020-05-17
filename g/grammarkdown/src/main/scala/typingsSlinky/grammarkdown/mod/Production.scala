package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.ProductionBody
import typingsSlinky.grammarkdown.tokensMod.ProductionSeperatorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Production")
@js.native
class Production protected ()
  extends typingsSlinky.grammarkdown.nodesMod.Production {
  def this(name: typingsSlinky.grammarkdown.nodesMod.Identifier) = this()
  def this(
    name: typingsSlinky.grammarkdown.nodesMod.Identifier,
    parameterList: typingsSlinky.grammarkdown.nodesMod.ParameterList
  ) = this()
  def this(
    name: typingsSlinky.grammarkdown.nodesMod.Identifier,
    parameterList: typingsSlinky.grammarkdown.nodesMod.ParameterList,
    colonToken: typingsSlinky.grammarkdown.nodesMod.Token[ProductionSeperatorKind]
  ) = this()
  def this(
    name: typingsSlinky.grammarkdown.nodesMod.Identifier,
    parameterList: typingsSlinky.grammarkdown.nodesMod.ParameterList,
    colonToken: typingsSlinky.grammarkdown.nodesMod.Token[ProductionSeperatorKind],
    body: ProductionBody
  ) = this()
}

