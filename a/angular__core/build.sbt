organization := "org.scalablytyped.slinky"
name := "angular__core"
version := "8.2.14-6c724f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-1acc03",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-c2d53f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-439deb",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-6aca83",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-b15df4",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-99d88a",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.5-65d3cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
