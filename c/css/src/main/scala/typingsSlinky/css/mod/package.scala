package typingsSlinky.css

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def parse(code: java.lang.String): typingsSlinky.css.mod.Stylesheet = typingsSlinky.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.css.mod.Stylesheet]
  @scala.inline
  def parse(code: java.lang.String, options: typingsSlinky.css.mod.ParserOptions): typingsSlinky.css.mod.Stylesheet = (typingsSlinky.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.css.mod.Stylesheet]
  
  @scala.inline
  def stringify(stylesheet: typingsSlinky.css.mod.Stylesheet): java.lang.String = typingsSlinky.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(stylesheet: typingsSlinky.css.mod.Stylesheet, options: typingsSlinky.css.mod.StringifyOptions): java.lang.String = (typingsSlinky.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(stylesheet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
