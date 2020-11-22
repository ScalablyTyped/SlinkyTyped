package typingsSlinky.jupyterlabUiComponents.labiconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object LabIcon {
  
  /**
    * A type that maybe can be resolved to a LabIcon instance.
    */
  type IMaybeResolvable = js.UndefOr[
    typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IResolvable | typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer
  ]
  
  /**
    * The complete type of the React component stored in the .react
    * field of a LabIcon.
    */
  type IReact = typingsSlinky.react.mod.ForwardRefExoticComponent[typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IReactProps]
  
  /**
    * The properties that can be passed into the React component stored in
    * the .react field of a LabIcon.
    */
  type IReactProps = typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IProps with typingsSlinky.react.mod.RefAttributes[org.scalajs.dom.raw.SVGElement]
  
  /**
    * The type of the svg node ref that can be passed into icon React components
    */
  type IReactRef = slinky.core.facade.ReactRef[org.scalajs.dom.raw.SVGElement]
  
  /** ******
    * types *
    *********/
  /**
    * A type that can be resolved to a LabIcon instance.
    */
  type IResolvable = java.lang.String | typingsSlinky.jupyterlabUiComponents.anon.IIconPartialIRenderer
}
