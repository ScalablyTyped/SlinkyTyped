package typingsSlinky.reactOverlays

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object usePopperMod {
  
  type Instance = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Instance */ js.Any
  
  type Modifier[Name, Options] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifier<Name, Options> */ js.Any
  
  type ModifierMap = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.std.Partial[typingsSlinky.reactOverlays.usePopperMod.Modifier[js.Any, js.Any]]
  ]
  
  type Modifiers = (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Options * / any['modifiers'] */ js.Any) | (typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.std.Partial[typingsSlinky.reactOverlays.usePopperMod.Modifier[js.Any, js.Any]]
  ])
  
  type Offset = typingsSlinky.reactOverlays.usePopperMod.OffsetFunction | typingsSlinky.reactOverlays.usePopperMod.OffsetValue
  
  type OffsetFunction = js.Function1[
    /* details */ typingsSlinky.reactOverlays.anon.Placement, 
    typingsSlinky.reactOverlays.usePopperMod.OffsetValue
  ]
  
  type OffsetValue = js.Tuple2[js.UndefOr[scala.Double | scala.Null], js.UndefOr[scala.Double | scala.Null]]
  
  type Options = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Options */ js.Any
  
  type Placement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
  
  type State = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.State */ js.Any
  
  type UsePopperOptions = (typingsSlinky.std.Omit[
    typingsSlinky.reactOverlays.usePopperMod.Options, 
    typingsSlinky.reactOverlays.reactOverlaysStrings.modifiers | typingsSlinky.reactOverlays.reactOverlaysStrings.placement | typingsSlinky.reactOverlays.reactOverlaysStrings.strategy
  ]) with typingsSlinky.reactOverlays.anon.Enabled
  
  type VirtualElement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.VirtualElement */ js.Any
}
