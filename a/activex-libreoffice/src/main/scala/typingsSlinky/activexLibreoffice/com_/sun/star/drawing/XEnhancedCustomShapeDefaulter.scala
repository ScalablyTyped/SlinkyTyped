package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XEnhancedCustomShapeDefaulter extends XInterface {
  
  /**
    * This interface allows to create shape properties for the given "ShapeType". The "ShapeType" string can be empty then the current "ShapeType" of the
    * shape is used. "non-primitive",
    *
    * "rectangle",
    *
    * "round-rectangle",
    *
    * "ellipse",
    *
    * "diamond",
    *
    * "isosceles-triangle"
    *
    * "right-triangle",
    *
    * "parallelogram",
    *
    * "trapezoid",
    *
    * "hexagon",
    *
    * "octagon",
    *
    * "cross",
    *
    * "star5",
    *
    * "right-arrow",
    *
    * "mso-spt14",
    *
    * "pentagon-right",
    *
    * "cube",
    *
    * "mso-spt17",
    *
    * "mso-spt18",
    *
    * "mso-spt19",
    *
    * "mso-spt20",
    *
    * "mso-spt21",
    *
    * "can",
    *
    * "ring",
    *
    * "mso-spt24",
    *
    * "mso-spt25",
    *
    * "mso-spt26",
    *
    * "mso-spt27",
    *
    * "mso-spt28",
    *
    * "mso-spt29",
    *
    * "mso-spt30",
    *
    * "mso-spt31",
    *
    * "mso-spt32",
    *
    * "mso-spt33",
    *
    * "mso-spt34",
    *
    * "mso-spt35",
    *
    * "mso-spt36",
    *
    * "mso-spt37",
    *
    * "mso-spt38",
    *
    * "mso-spt39",
    *
    * "mso-spt40",
    *
    * "mso-spt41",
    *
    * "mso-spt42",
    *
    * "mso-spt43",
    *
    * "mso-spt44",
    *
    * "mso-spt45",
    *
    * "mso-spt46",
    *
    * "line-callout-1",
    *
    * "line-callout-2",
    *
    * "mso-spt49",
    *
    * "mso-spt50",
    *
    * "mso-spt51",
    *
    * "mso-spt52",
    *
    * "mso-spt53",
    *
    * "mso-spt54",
    *
    * "chevron",
    *
    * "pentagon",
    *
    * "forbidden",
    *
    * "star8",
    *
    * "mso-spt59",
    *
    * "mso-spt60",
    *
    * "rectangular-callout",
    *
    * "round-rectangular-callout",
    *
    * "round-callout",
    *
    * "mso-spt64",
    *
    * "paper",
    *
    * "left-arrow",
    *
    * "down-arrow",
    *
    * "up-arrow",
    *
    * "left-right-arrow",
    *
    * "up-down-arrow",
    *
    * "mso-spt71",
    *
    * "bang",
    *
    * "lightning",
    *
    * "heart",
    *
    * "mso-spt75",
    *
    * "quad-arrow",
    *
    * "left-arrow-callout",
    *
    * "right-arrow-callout",
    *
    * "up-arrow-callout",
    *
    * "down-arrow-callout",
    *
    * "left-right-arrow-callout",
    *
    * "up-down-arrow-callout",
    *
    * "quad-arrow-callout",
    *
    * "quad-bevel",
    *
    * "left-bracket",
    *
    * "right-bracket",
    *
    * "left-brace",
    *
    * "right-brace",
    *
    * "mso-spt89",
    *
    * "mso-spt90",
    *
    * "mso-spt91",
    *
    * "star24",
    *
    * "striped-right-arrow",
    *
    * "notched-right-arrow",
    *
    * "block-arc",
    *
    * "smiley",
    *
    * "vertical-scroll",
    *
    * "horizontal-scroll",
    *
    * "circular-arrow",
    *
    * "mso-spt100",
    *
    * "mso-spt101",
    *
    * "mso-spt102",
    *
    * "mso-spt103",
    *
    * "mso-spt104",
    *
    * "mso-spt105",
    *
    * "cloud-callout",
    *
    * "mso-spt107",
    *
    * "mso-spt108",
    *
    * "flowchart-process",
    *
    * "flowchart-decision",
    *
    * "flowchart-data",
    *
    * "flowchart-predefined-process",
    *
    * "flowchart-internal-storage",
    *
    * "flowchart-document",
    *
    * "flowchart-multidocument",
    *
    * "flowchart-terminator",
    *
    * "flowchart-preparation",
    *
    * "flowchart-manual-input",
    *
    * "flowchart-manual-operation",
    *
    * "flowchart-connector",
    *
    * "flowchart-card",
    *
    * "flowchart-punched-tape",
    *
    * "flowchart-summing-junction",
    *
    * "flowchart-or",
    *
    * "flowchart-collate",
    *
    * "flowchart-sort",
    *
    * "flowchart-extract",
    *
    * "flowchart-merge",
    *
    * "mso-spt129",
    *
    * "flowchart-stored-data",
    *
    * "flowchart-sequential-access",
    *
    * "flowchart-magnetic-disk",
    *
    * "flowchart-direct-access-storage",
    *
    * "flowchart-display",
    *
    * "flowchart-delay",
    *
    * "fontwork-plain-text",
    *
    * "fontwork-stop",
    *
    * "fontwork-triangle-up",
    *
    * "fontwork-triangle-down",
    *
    * "fontwork-chevron-up",
    *
    * "fontwork-chevron-down",
    *
    * "mso-spt142",
    *
    * "mso-spt143",
    *
    * "fontwork-arch-up-curve",
    *
    * "fontwork-arch-down-curve",
    *
    * "fontwork-circle-curve",
    *
    * "fontwork-open-circle-curve",
    *
    * "fontwork-arch-up-pour",
    *
    * "fontwork-arch-down-pour",
    *
    * "fontwork-circle-pour",
    *
    * "fontwork-open-circle-pour",
    *
    * "fontwork-curve-up",
    *
    * "fontwork-curve-down",
    *
    * "fontwork-fade-up-and-right",
    *
    * "fontwork-fade-up-and-left",
    *
    * "fontwork-wave",
    *
    * "mso-spt157",
    *
    * "mso-spt158",
    *
    * "mso-spt159",
    *
    * "fontwork-inflate",
    *
    * "mso-spt161",
    *
    * "mso-spt162",
    *
    * "mso-spt163",
    *
    * "mso-spt164",
    *
    * "mso-spt165",
    *
    * "mso-spt166",
    *
    * "mso-spt167",
    *
    * "fontwork-fade-right",
    *
    * "fontwork-fade-left",
    *
    * "fontwork-fade-up",
    *
    * "fontwork-fade-down",
    *
    * "fontwork-slant-up",
    *
    * "fontwork-slant-down",
    *
    * "mso-spt174",
    *
    * "mso-spt175",
    *
    * "flowchart-alternate-process",
    *
    * "flowchart-off-page-connector",
    *
    * "mso-spt178",
    *
    * "mso-spt179",
    *
    * "mso-spt180",
    *
    * "line-callout-3",
    *
    * "mso-spt182",
    *
    * "sun",
    *
    * "moon",
    *
    * "bracket-pair",
    *
    * "brace-pair",
    *
    * "star4",
    *
    * "mso-spt188",
    *
    * "mso-spt189",
    *
    * "mso-spt190",
    *
    * "mso-spt191",
    *
    * "mso-spt192",
    *
    * "mso-spt193",
    *
    * "mso-spt194",
    *
    * "mso-spt195",
    *
    * "mso-spt196",
    *
    * "mso-spt197",
    *
    * "mso-spt198",
    *
    * "mso-spt199",
    *
    * "mso-spt200",
    *
    * "mso-spt201",
    *
    * "mso-spt202",
    *
    *
    *
    * SJ: following shape types can't be created with this method, they are part of the gallery (soon they also will be added) gallery: quadrat gallery:
    * round-quadrat gallery: circle gallery: circle-pie gallery: frame gallery: flower gallery: cloud gallery: puzzle gallery: octagon-bevel gallery:
    * diamond-bevel gallery: up-right-arrow gallery: up-right-down-arrow gallery: corner-right-arrow gallery: split-arrow gallery: up-right-arrow-callout
    * gallery: split-round-arrow gallery: s-sharped-arrow Gallery: star6 Gallery: star12 Gallery: concave-star6 Gallery: signet Gallery: doorplate gallery:
    * fontwork-arch-left-curve gallery: fontwork-arch-right-curve gallery: fontwork-arch-left-pour gallery: fontwork-arch-right-pour
    */
  def createCustomShapeDefaults(aShapeType: String): Unit = js.native
}
object XEnhancedCustomShapeDefaulter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createCustomShapeDefaults: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnhancedCustomShapeDefaulter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCustomShapeDefaults = js.Any.fromFunction1(createCustomShapeDefaults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnhancedCustomShapeDefaulter]
  }
  
  @scala.inline
  implicit class XEnhancedCustomShapeDefaulterOps[Self <: XEnhancedCustomShapeDefaulter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateCustomShapeDefaults(value: String => Unit): Self = this.set("createCustomShapeDefaults", js.Any.fromFunction1(value))
  }
}
