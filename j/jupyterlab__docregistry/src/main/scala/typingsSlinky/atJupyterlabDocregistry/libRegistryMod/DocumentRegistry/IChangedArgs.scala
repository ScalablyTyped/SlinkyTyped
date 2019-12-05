package typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.added
import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.fileType
import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.modelFactory
import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.removed
import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.widgetExtension
import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.widgetFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  */
trait IChangedArgs extends js.Object {
  /**
    * Whether the item was added or removed.
    */
  val change: added | removed
  /**
    * The name of the item or the widget factory being extended.
    */
  val name: String
  /**
    * The type of the changed item.
    */
  val `type`: widgetFactory | modelFactory | widgetExtension | fileType
}

object IChangedArgs {
  @scala.inline
  def apply(
    change: added | removed,
    name: String,
    `type`: widgetFactory | modelFactory | widgetExtension | fileType
  ): IChangedArgs = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
}

