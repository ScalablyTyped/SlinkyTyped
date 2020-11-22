package typingsSlinky.antDesignProUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typingMod {
  
  type ProFieldRequestData[T, U] = js.Function2[
    /* params */ U, 
    /* props */ T, 
    js.Promise[js.Array[typingsSlinky.antDesignProUtils.anon.Dictkey]]
  ]
  
  type ProSchema[T, U, Extra] = (typingsSlinky.antDesignProUtils.anon.DataIndex[T, U]) with Extra
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.form
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.list
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.descriptions
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.table
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.cardList
    - js.UndefOr[scala.Nothing]
  */
  type ProSchemaComponentTypes = js.UndefOr[typingsSlinky.antDesignProUtils.typingMod._ProSchemaComponentTypes]
  
  type ProSchemaValueEnumMap = typingsSlinky.std.Map[
    typingsSlinky.react.mod.ReactText, 
    typingsSlinky.antDesignProUtils.typingMod.ProSchemaValueEnumType | slinky.core.facade.ReactElement
  ]
  
  type ProSchemaValueEnumObj = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.antDesignProUtils.typingMod.ProSchemaValueEnumType | slinky.core.facade.ReactElement
  ]
  
  type SearchTransformKeyFn = js.Function3[
    /* value */ js.Any, 
    /* field */ java.lang.String, 
    /* object */ js.Any, 
    java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  ]
}
