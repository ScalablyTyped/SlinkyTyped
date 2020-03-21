package typingsSlinky.jupyterlabDocregistry.registryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentRegistry {
  /**
    * A type alias for a code context.
    */
  type CodeContext = typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext[typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel]
  /**
    * A type alias for a code model factory.
    */
  type CodeModelFactory = typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory[typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel]
  /**
    * A type alias for a context.
    */
  type Context = typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext[typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
  /**
    * A type alias for a standard model factory.
    */
  type ModelFactory = typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory[typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
  /**
    * A type alias for a standard widget extension.
    */
  type WidgetExtension = typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetExtension[
    typingsSlinky.phosphorWidgets.mod.Widget, 
    typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
  ]
  /**
    * A type alias for a standard widget factory.
    */
  type WidgetFactory = typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory[
    typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget[
      typingsSlinky.phosphorWidgets.mod.Widget, 
      typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
    ], 
    typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
  ]
}
