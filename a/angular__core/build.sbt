organization := "org.scalablytyped.slinky"
name := "angular__core"
version := "10.0.7-8ec873"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "10.0.7-17a148",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200721Z-d49bc9",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.2-a28e73",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.2-e25fd9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-1a5702",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.7-1dcaa8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
