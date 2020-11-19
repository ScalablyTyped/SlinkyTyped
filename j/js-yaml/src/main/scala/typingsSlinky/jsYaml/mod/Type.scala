package typingsSlinky.jsYaml.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsYaml.jsYamlStrings.mapping
import typingsSlinky.jsYaml.jsYamlStrings.scalar
import typingsSlinky.jsYaml.jsYamlStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-yaml", "Type")
@js.native
class Type protected () extends js.Object {
  def this(tag: String) = this()
  def this(tag: String, opts: TypeConstructorOptions) = this()
  
  def construct(data: js.Any): js.Any = js.native
  
  var defaultStyle: String | Null = js.native
  
  var instanceOf: js.Object | Null = js.native
  
  var kind: sequence | scalar | mapping | Null = js.native
  
  var predicate: (js.Function1[/* data */ js.Object, Boolean]) | Null = js.native
  
  var represent: (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]]) | Null = js.native
  
  def resolve(data: js.Any): Boolean = js.native
  
  var styleAliases: StringDictionary[js.Any] = js.native
}
