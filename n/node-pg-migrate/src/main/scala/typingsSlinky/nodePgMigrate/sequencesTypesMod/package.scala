package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sequencesTypesMod {
  type AlterSequence = js.Function2[
    /* sequenceName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* sequenceOptions */ typingsSlinky.nodePgMigrate.sequencesTypesMod.SequenceOptionsAlter, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateSequence = typingsSlinky.nodePgMigrate.sequencesTypesMod.CreateSequenceFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateSequenceFn
  type CreateSequenceFn = js.Function2[
    /* sequenceName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* sequenceOptions */ js.UndefOr[
      typingsSlinky.nodePgMigrate.sequencesTypesMod.SequenceOptionsCreate with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropSequence = js.Function2[
    /* sequenceName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameSequence = typingsSlinky.nodePgMigrate.sequencesTypesMod.RenameSequenceFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameSequenceFn
  type RenameSequenceFn = js.Function2[
    /* oldSequenceName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newSequenceName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
