organization := "org.scalablytyped.slinky"
name := "angular__platform-browser-dynamic"
version := "8.2.14-cbd42a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-2f620f",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-0520ba",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-d3352a",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-1736f1",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-bf0b8c",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-f4b73d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-f7040a",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.3-c54482")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
