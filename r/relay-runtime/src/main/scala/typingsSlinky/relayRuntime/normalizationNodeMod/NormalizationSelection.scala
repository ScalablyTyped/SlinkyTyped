package typingsSlinky.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.anon.FragmentName
import typingsSlinky.relayRuntime.relayRuntimeStrings.Defer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationCondition
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationClientExtension
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationDefer
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationField
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationHandle
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationInlineFragment
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationModuleImport
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationStream
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationTypeDiscriminator
*/
trait NormalizationSelection extends StObject
object NormalizationSelection {
  
  @scala.inline
  def NormalizationClientExtension(kind: String, selections: js.Array[NormalizationSelection]): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationClientExtension]
  }
  
  @scala.inline
  def NormalizationCondition(
    condition: String,
    kind: String,
    passingValue: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationCondition]
  }
  
  @scala.inline
  def NormalizationDefer(kind: Defer, label: String, selections: js.Array[NormalizationSelection]): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationDefer]
  }
  
  @scala.inline
  def NormalizationInlineFragment(kind: String, selections: js.Array[NormalizationSelection], `type`: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationInlineFragment]
  }
  
  @scala.inline
  def NormalizationLinkedField(
    args: js.Array[NormalizationArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedField]
  }
  
  @scala.inline
  def NormalizationLinkedHandle(handle: String, key: String, kind: String, name: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle]
  }
  
  @scala.inline
  def NormalizationMatchField(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String
  ): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationMatchField]
  }
  
  @scala.inline
  def NormalizationModuleImport(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationModuleImport]
  }
  
  @scala.inline
  def NormalizationScalarField(kind: String, name: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarField]
  }
  
  @scala.inline
  def NormalizationScalarHandle(handle: String, key: String, kind: String, name: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarHandle]
  }
  
  @scala.inline
  def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationStream]
  }
  
  @scala.inline
  def NormalizationTypeDiscriminator(abstractKey: String, kind: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationTypeDiscriminator = {
    val __obj = js.Dynamic.literal(abstractKey = abstractKey.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationTypeDiscriminator]
  }
}
