package typingsSlinky.rcSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object generatorMod {
  
  type DefaultValueType = typingsSlinky.rcSelect.generatorMod.RawValueType | (js.Array[
    typingsSlinky.rcSelect.generatorMod.LabelValueType | typingsSlinky.rcSelect.generatorMod.RawValueType
  ]) | typingsSlinky.rcSelect.generatorMod.LabelValueType
  
  type FilterFunc[OptionType] = js.Function2[
    /* inputValue */ java.lang.String, 
    /* option */ js.UndefOr[OptionType], 
    scala.Boolean
  ]
  
  type FilterOptions[OptionsType /* <: js.Array[js.Object] */] = js.Function3[
    /* searchValue */ java.lang.String, 
    /* options */ OptionsType, 
    /* config */ typingsSlinky.rcSelect.anon.FilterOption[OptionsType], 
    OptionsType
  ]
  
  type FlattenOptionsType[OptionsType /* <: js.Array[js.Object] */] = js.Array[typingsSlinky.rcSelect.anon.Dictname[OptionsType]]
  
  type GetLabeledValue[FOT /* <: typingsSlinky.rcSelect.generatorMod.FlattenOptionsType[js.Array[js.Object]] */] = js.Function2[
    /* value */ typingsSlinky.rcSelect.generatorMod.RawValueType, 
    /* config */ typingsSlinky.rcSelect.anon.LabelInValue[FOT], 
    typingsSlinky.rcSelect.generatorMod.LabelValueType
  ]
  
  type Key = java.lang.String | scala.Double
  
  type OnClear = js.Function0[scala.Unit]
  
  type RawValueType = java.lang.String | scala.Double
  
  type SingleType[MixType] = MixType
}
