package typingsSlinky.javascriptObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("javascript-obfuscator", JSImport.Namespace)
@js.native
object javascriptObfuscatorMod extends js.Object {
  
  def obfuscate(sourceCode: String): ObfuscatedCode = js.native
  def obfuscate(sourceCode: String, inputOptions: ObfuscatorOptions): ObfuscatedCode = js.native
  
  def obfuscateMultiple[TSourceCodesObject /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TDictionary<string> */ js.Any */](sourceCodesObject: TSourceCodesObject): js.Any = js.native
  def obfuscateMultiple[TSourceCodesObject /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TDictionary<string> */ js.Any */](
    sourceCodesObject: TSourceCodesObject,
    inputOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TInputOptions */ js.Any
  ): js.Any = js.native
  
  val version: String = js.native
  
  type ObfuscatedCode = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IObfuscatedCode */ js.Any
  
  type ObfuscatorOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TInputOptions */ js.Any
}
