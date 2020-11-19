package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object choiceGroupOptionTypesMod {
  
  type OnChangeCallback = js.UndefOr[
    js.Function2[
      /* evt */ js.UndefOr[
        slinky.core.SyntheticEvent[
          org.scalajs.dom.raw.EventTarget with (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement), 
          org.scalajs.dom.raw.Event
        ]
      ], 
      /* props */ js.UndefOr[typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
      scala.Unit
    ]
  ]
  
  type OnFocusCallback = js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        slinky.web.SyntheticFocusEvent[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement]
      ], 
      /* props */ js.UndefOr[typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
      js.UndefOr[scala.Unit]
    ]
  ]
}
