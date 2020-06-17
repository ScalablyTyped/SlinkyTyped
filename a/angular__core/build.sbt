organization := "org.scalablytyped.slinky"
name := "angular__core"
version := "8.2.14-98c119"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-d1a052",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-8bcc24",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-094fa5",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-c344de",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-e9e4c8",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-5d7fbb",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.3-d2ed4f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
