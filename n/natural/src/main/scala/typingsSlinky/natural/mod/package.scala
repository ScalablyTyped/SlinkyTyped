package typingsSlinky.natural

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BayesClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  
  @scala.inline
  def DamerauLevenshteinDistance(source: java.lang.String, target: java.lang.String): scala.Double = (typingsSlinky.natural.mod.^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def DamerauLevenshteinDistance(
    source: java.lang.String,
    target: java.lang.String,
    options: typingsSlinky.natural.anon.DamerauLevenshteinDistanc
  ): typingsSlinky.natural.mod.SubstringDistanceResult = (typingsSlinky.natural.mod.^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.natural.mod.SubstringDistanceResult]
  @scala.inline
  def DamerauLevenshteinDistance(
    source: java.lang.String,
    target: java.lang.String,
    options: typingsSlinky.natural.anon.DamerauLevenshteinDistancDeletioncost
  ): scala.Double = (typingsSlinky.natural.mod.^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def DamerauLevenshteinDistance(
    source: java.lang.String,
    target: java.lang.String,
    options: typingsSlinky.natural.anon.DamerauLevenshteinDistancInsertioncost
  ): scala.Double | typingsSlinky.natural.mod.SubstringDistanceResult = (typingsSlinky.natural.mod.^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | typingsSlinky.natural.mod.SubstringDistanceResult]
  
  type LogisticRegressionClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  
  type TfIdfCallback = js.Function2[/* i */ scala.Double, /* measure */ scala.Double, scala.Unit]
  
  type WordNetGetCallback = js.Function1[/* results */ typingsSlinky.natural.mod.WordNetLookupResults, scala.Unit]
  
  type WordNetLookupCallback = js.Function1[/* results */ js.Array[typingsSlinky.natural.mod.WordNetLookupResults], scala.Unit]
}
