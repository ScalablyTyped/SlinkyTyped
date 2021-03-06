package typingsSlinky.reactJsonschemaForm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Field = slinky.core.ReactComponentClass[typingsSlinky.reactJsonschemaForm.mod.FieldProps[js.Any]]
  
  type FieldError = java.lang.String
  
  type ISubmitEvent[T] = typingsSlinky.reactJsonschemaForm.mod.IChangeEvent[T]
  
  type IdSchema[T] = typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.IdSchema with org.scalablytyped.runtime.TopLevel[js.Any] with typingsSlinky.reactJsonschemaForm.mod.FieldId
  
  type PathSchema[T] = typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.PathSchema with org.scalablytyped.runtime.TopLevel[js.Any] with typingsSlinky.reactJsonschemaForm.mod.FieldPath
  
  type Widget = slinky.core.ReactComponentClass[typingsSlinky.reactJsonschemaForm.mod.WidgetProps]
  
  @scala.inline
  def withTheme[T](themeProps: typingsSlinky.reactJsonschemaForm.mod.ThemeProps[T]): slinky.core.ReactComponentClass[typingsSlinky.reactJsonschemaForm.mod.FormProps[T]] = typingsSlinky.reactJsonschemaForm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(themeProps.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactJsonschemaForm.mod.FormProps[T]]]
}
