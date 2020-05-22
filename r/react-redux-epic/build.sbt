organization := "org.scalablytyped.slinky"
name := "react-redux-epic"
version := "1.1-dt-20200515Z-fdc54c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-7392f6",
  "org.scalablytyped.slinky" %%% "redux-observable" % "1.2.0-4be359",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-a158f0",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-1d035b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
