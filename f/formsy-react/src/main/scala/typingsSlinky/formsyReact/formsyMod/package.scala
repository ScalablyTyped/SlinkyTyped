package typingsSlinky.formsyReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formsyMod {
  
  type OnSubmitCallback = js.Function4[
    /* model */ typingsSlinky.formsyReact.interfacesMod.IModel, 
    /* resetModel */ typingsSlinky.formsyReact.interfacesMod.IResetModel, 
    /* updateInputsWithError */ typingsSlinky.formsyReact.interfacesMod.IUpdateInputsWithError, 
    /* event */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, typingsSlinky.react.mod.FormHTMLAttributes[js.Any]], 
    scala.Unit
  ]
}
