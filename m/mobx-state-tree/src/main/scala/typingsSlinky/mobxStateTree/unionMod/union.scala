package typingsSlinky.mobxStateTree.unionMod

import typingsSlinky.mobxStateTree.modelMod.IModelType
import typingsSlinky.mobxStateTree.modelMod.ModelCreationType2
import typingsSlinky.mobxStateTree.modelMod.ModelInstanceType
import typingsSlinky.mobxStateTree.modelMod.ModelProperties
import typingsSlinky.mobxStateTree.modelMod.ModelSnapshotType2
import typingsSlinky.mobxStateTree.typeMod.IAnyType
import typingsSlinky.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/union", "union")
@js.native
object union extends js.Object {
  
  def apply(dispatchOrType: IAnyType, otherTypes: IAnyType*): IAnyType = js.native
  def apply(dispatchOrType: UnionOptions, otherTypes: IAnyType*): IAnyType = js.native
  def apply(types: IAnyType*): IAnyType = js.native
  def apply[CA, SA, TA, CB, SB, TB](A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
  def apply[CA, SA, TA, CB, SB, TB](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](options: UnionOptions, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC], D: IType[CD, SD, TD]): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD]
  ): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE]
  ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE]
  ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH],
    I: IType[CI, SI, TI]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ] = js.native
  def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH],
    I: IType[CI, SI, TI]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ] = js.native
  def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ] = js.native
}
