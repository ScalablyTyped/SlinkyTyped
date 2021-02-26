package typingsSlinky.kuromoji

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IpadicFormatter = typingsSlinky.kuromoji.mod.Formatter[typingsSlinky.kuromoji.mod.IpadicFeatures]
  
  type UnknownDictionary = typingsSlinky.kuromoji.mod.TokenInfoDictionary
  
  @scala.inline
  def builder(option: typingsSlinky.kuromoji.mod.TokenizerBuilderOption): typingsSlinky.kuromoji.mod.TokenizerBuilder[typingsSlinky.kuromoji.mod.IpadicFeatures] = typingsSlinky.kuromoji.mod.^.asInstanceOf[js.Dynamic].applyDynamic("builder")(option.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.kuromoji.mod.TokenizerBuilder[typingsSlinky.kuromoji.mod.IpadicFeatures]]
  
  @scala.inline
  def dictionaryBuilder(): typingsSlinky.kuromoji.mod.DictionaryBuilder_ = typingsSlinky.kuromoji.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dictionaryBuilder")().asInstanceOf[typingsSlinky.kuromoji.mod.DictionaryBuilder_]
}
